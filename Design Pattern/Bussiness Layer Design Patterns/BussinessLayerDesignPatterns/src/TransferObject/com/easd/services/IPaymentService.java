package TransferObject.com.easd.services;

import TransferObject.com.easd.dto.PaymentDTO;

public interface IPaymentService extends IService{

    public void addPaymnet(PaymentDTO paymentDTO);
    
}
