package InterceptingFilter.lec2;

import java.util.Vector;

public class FilterChain {

    private Vector<Filter> filterList=new Vector<>();

    public FilterChain(){
    }

    public void processFilter(){
        for(Filter filter: filterList){
            filter.excute();
        }
        System.out.println();
    }

    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    
}
