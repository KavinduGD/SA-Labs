package DesignPatern2022;

public class PaymentService {

    public static PaymentService uniqueObject;

    private PaymentService(){}

    public static PaymentService getInstance(){
        if(uniqueObject==null){
            uniqueObject= new PaymentService();
        }
        return uniqueObject;
    }

    public void makepayment(double amount){
        System.out.println("Payment service paid amount of = " + amount);
    }
    
}
