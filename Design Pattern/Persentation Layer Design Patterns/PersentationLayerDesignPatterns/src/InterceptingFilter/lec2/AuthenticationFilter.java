package InterceptingFilter.lec2;

public class AuthenticationFilter implements Filter {

    private Filter target;

    public AuthenticationFilter(){}

    public AuthenticationFilter(Filter targer){
        this.target= targer;
    }

    public void excute(){
        if(this.target !=null){
            this.target.excute();
        }
        System.out.println("Authentication filter");
    }

    
}
