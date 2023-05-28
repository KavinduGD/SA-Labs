package DesignPatern2022;

public class PaymentController  implements FrontController{

    PaymentService paymentService;
    double amount;

    public PaymentController(PaymentService paymentService,double amount){
        this.paymentService=paymentService;
        this.amount=amount;
    }

    public void excute() {
     paymentService.makepayment(amount);
    }

    
    
}
