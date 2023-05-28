package FrontController.Example1;

public class myMain {
    
    public static void main(String[] args) {
   
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
     }
}
