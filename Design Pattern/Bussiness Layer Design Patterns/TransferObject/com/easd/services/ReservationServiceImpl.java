package TransferObject.com.easd.services;

import TransferObject.com.easd.dto.PaymentDTO;
import TransferObject.com.easd.dto.ReservationDTO;

public class ReservationServiceImpl implements  IReservationService{

    
    public void addPaymnet(PaymentDTO paymentDTO) {  
    }

    @Override
    public void addReservation(ReservationDTO reservationDTO) {
        int roomNo = reservationDTO.getRoomNo();
        double amount = reservationDTO.getAmount();
        System.out.println("insert into Reservation Table" +roomNo+" - "+amount);
    }

    
    
}
