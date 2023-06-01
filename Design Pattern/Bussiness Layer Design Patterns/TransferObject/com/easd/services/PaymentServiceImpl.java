package TransferObject.com.easd.services;

import TransferObject.com.easd.dto.PaymentDTO;
import TransferObject.com.easd.dto.ReservationDTO;

public class PaymentServiceImpl implements IPaymentService{

    public void addPaymnet(PaymentDTO paymentDTO){
        double amount = paymentDTO.getAmount();
        String description = paymentDTO.getDescription();
        System.out.println("insert into Payment Table" +description+" - "+amount);
    }

    @Override
    public void addReservation(ReservationDTO reservationDTO) {        
    }
    
}
