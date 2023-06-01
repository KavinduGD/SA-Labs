package DesignPatern2022;

public class Test {
    public static void main(String[] args) {
        

        ServiceSelector serviceSelector = new ServiceSelector();

        PaymentService paymentService= PaymentService.getInstance();
        ReservationService reservationService= ReservationService.getInstance();
    
       PaymentController paymentController= new PaymentController(paymentService, 50000);
       ReservationController reservationController= new ReservationController(reservationService, 5);

        serviceSelector.serController(paymentController, reservationController);
        serviceSelector.selectPaymentService();
        serviceSelector.selectResevationService();


    }
}
