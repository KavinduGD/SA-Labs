package TransferObject.com.easd.services;

import TransferObject.com.easd.dto.PaymentDTO;
import TransferObject.com.easd.dto.ReservationDTO;

public interface IService  {

    void addPaymnet(PaymentDTO paymentDTO);

    void addReservation(ReservationDTO reservationDTO);
      
}
