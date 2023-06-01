package InterceptingFilter.lec2;

public class InputValidationFilter implements Filter{
    
    private Filter target;

    public InputValidationFilter(){}

    public InputValidationFilter(Filter target){
        this.target=target;
    }

    public void excute(){

        if(target != null){
            target.excute();
        }

        System.out.println("Input Validation Filter");
    }
    


}
