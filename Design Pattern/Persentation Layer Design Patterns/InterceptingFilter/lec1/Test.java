package InterceptingFilter.lec1;

public class Test {

    public static void main(String[] args) {

        Filter filter= new AuthenticationFilter(new DebuggingFilter(new InputValidationFilter()));
        filter.excute();

        System.out.println();
        new AuthenticationFilter(new DebuggingFilter()).excute();

        System.out.println();
        new AuthenticationFilter().excute();    

        System.out.println();
        new InputValidationFilter(new DebuggingFilter(new AuthenticationFilter())).excute();


    }
   
}
