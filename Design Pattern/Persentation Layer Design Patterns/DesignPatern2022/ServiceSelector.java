package DesignPatern2022;

public class ServiceSelector {
    FrontController paymentController;
    FrontController reservationController;

    public void serController(PaymentController paymentController,ReservationController reservationController){
        this.paymentController=paymentController;
        this.reservationController=reservationController;
    };

    public void selectPaymentService(){
        paymentController.excute();
    }

    public void selectResevationService(){
        reservationController.excute();
    }

    
}
