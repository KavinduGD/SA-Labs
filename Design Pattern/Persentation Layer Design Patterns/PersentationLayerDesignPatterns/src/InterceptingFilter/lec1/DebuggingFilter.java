package InterceptingFilter.lec1;

public class DebuggingFilter implements Filter{

    Filter target;

    public DebuggingFilter(){}
    
    public DebuggingFilter (Filter target){
        this.target= target;
    }

    public void  excute(){
        if(target!=null){
            target.excute();
        }

        System.out.println("Debugging Filter");
    }
}
