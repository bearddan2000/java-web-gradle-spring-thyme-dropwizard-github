package example.resources;

import java.util.List;
import java.util.Collections;

import example.model.filter.IFilter;

public class Helper {

    public List<? extends IFilter> sortFilterList(List<? extends IFilter> iterFilterList){

      Collections.sort(iterFilterList, (o1, o2) -> (o1.getName().compareTo(o2.getName())));

      return iterFilterList;
    }
}
