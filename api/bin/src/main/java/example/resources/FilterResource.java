package example.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

import example.model.filter.IFilter;
import example.model.filter.BuildFilter;
import example.model.filter.LangFilter;
import example.model.filter.PlatformFilter;
import example.model.filter.TechFilter;

@Path("/filter")
@Produces(MediaType.APPLICATION_JSON)
public class FilterResource {

  Helper helper = new Helper();

  @Path("/lang")
  @GET
  @Timed
  public List<? extends IFilter> getLang() {
      List<LangFilter> lst = FilterHelper.LangFilterList();
      return helper.sortFilterList(lst);
  }

  @Path("/platform")
  @GET
  @Timed
  public List<? extends IFilter> getPlatform() {
      List<PlatformFilter> lst = FilterHelper.PlatformFilterList();
      return helper.sortFilterList(lst);
  }

  @Path("/build")
  @GET
  @Timed
  public List<? extends IFilter> getBuild() {
      List<BuildFilter> lst = FilterHelper.BuildFilterList();
      return helper.sortFilterList(lst);
  }

  @Path("/tech")
  @GET
  @Timed
  public List<? extends IFilter> getTech() {
      List<TechFilter> lst = FilterHelper.TechFilterList();
      return helper.sortFilterList(lst);
  }
}
