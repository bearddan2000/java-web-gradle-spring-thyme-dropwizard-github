package example.resources;

import java.util.ArrayList;
import java.util.List;

import example.model.filter.BuildFilter;
import example.model.filter.LangFilter;
import example.model.filter.PlatformFilter;
import example.model.filter.TechFilter;

public class FilterHelper {

  public static List<LangFilter> LangFilterList()
  {
    List<LangFilter> lst = new ArrayList<LangFilter>()
    {{
      add(new LangFilter("burlywood","aspnet"));
      add(new LangFilter("cadetblue","java"));
      add(new LangFilter("cadetblue","jruby"));
      add(new LangFilter("cadetblue","jython"));
      add(new LangFilter("cadetblue","kotlin"));
      add(new LangFilter("cadetblue","groovy"));
      add(new LangFilter("cadetblue","scala"));
      add(new LangFilter("khaki","rust"));
      add(new LangFilter("sienna","dart"));
      add(new LangFilter("khaki","c"));
      add(new LangFilter("khaki","cpp"));
      add(new LangFilter("burlywood","csharp"));
      add(new LangFilter("khaki", "perl"));
      add(new LangFilter("cadetblue","python"));
      add(new LangFilter("khaki","php"));
      add(new LangFilter("sienna","nodejs"));
      add(new LangFilter("sienna","javascript"));
      add(new LangFilter("sienna","flutter"));
      add(new LangFilter("cadetblue","clojure"));
      add(new LangFilter("khaki","ruby"));
      add(new LangFilter("burlywood","vbnet"));
      add(new LangFilter("orange","erlang"));
      add(new LangFilter("orange","elixir"));
      add(new LangFilter("orange","haskell"));
      add(new LangFilter("cadetblue","golang"));
      add(new LangFilter("darkgrey","julia"));
      add(new LangFilter("orange","swift"));
      add(new LangFilter("khaki","lua"));
      add(new LangFilter("pink","unclass"));
    }};

    return lst;
  }

  public static List<PlatformFilter> PlatformFilterList()
  {
    List<PlatformFilter> lst = new ArrayList<PlatformFilter>()
    {{
      add(new PlatformFilter("cadetblue","web"));
      add(new PlatformFilter("orange","desktop"));
      add(new PlatformFilter("sienna","cli"));
      add(new PlatformFilter("pink","unclass"));
    }};

    return lst;
  }

  public static List<BuildFilter> BuildFilterList()
  {
    List<BuildFilter> lst = new ArrayList<BuildFilter>()
    {{
      add(new BuildFilter("pink","unclass"));
      add(new BuildFilter("cadetblue", "ant"));
      add(new BuildFilter("aqua", "android"));
      add(new BuildFilter("aqua", "bazel"));
      add(new BuildFilter("cadetblue", "buck"));
      add(new BuildFilter("cadetblue", "gradle"));
      add(new BuildFilter("cadetblue", "maven"));
      add(new BuildFilter("cadetblue", "mill"));
      add(new BuildFilter("aqua", "pants"));
      add(new BuildFilter("aqua", "spa"));
      add(new BuildFilter("cadetblue", "sbt"));
      add(new BuildFilter("cadetblue", "bloop"));
    }};

    return lst;
  }

  public static List<TechFilter> TechFilterList()
  {
    List<TechFilter> lst = new ArrayList<TechFilter>()
    {{
      add(new TechFilter("aqua","ansible"));
      add(new TechFilter("aqua","saltstack"));
      add(new TechFilter("aqua","chef"));
      add(new TechFilter("purple","bash"));
      add(new TechFilter("purple","powershell"));
      add(new TechFilter("pink","unclass"));
    }};

    return lst;
  }
}
