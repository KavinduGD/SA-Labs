package TransferObject.com.easd.controllers;

import TransferObject.com.easd.common.ServiceDelegator;
import TransferObject.com.easd.dto.PaymentDTO;
import TransferObject.com.easd.dto.ReservationDTO;

public class Contoller {

    public static void main(String[] args) {
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setAmount(5000);
        paymentDTO.setDescription("Elecrisity Bill");

        ServiceDelegator.getService("payment").addPaymnet(paymentDTO);

        ReservationDTO reservationDTO = new ReservationDTO();
        reservationDTO.setAmount(5000);
        reservationDTO.setRoomNo(101);

        ServiceDelegator.getService("reservation").addReservation(reservationDTO);
     
    }


   
}
