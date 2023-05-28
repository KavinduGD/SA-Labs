package InterceptingFilter.lec2;

public class FilterManager {

    public static void main(String[] args) {
        
        FilterChain filterChain= new FilterChain();
        
        filterChain.addFilter(new DebuggingFilter());
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new InputValidationFilter());
        filterChain.processFilter();

        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new DebuggingFilter());
        filterChain.processFilter();
    }
    
}
