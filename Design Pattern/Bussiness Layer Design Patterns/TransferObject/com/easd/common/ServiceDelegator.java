package TransferObject.com.easd.common;

import TransferObject.com.easd.services.IService;
import TransferObject.com.easd.services.PaymentServiceImpl;
import TransferObject.com.easd.services.ReservationServiceImpl;

public class ServiceDelegator {

    public static IService getService(String type){
        if(type.equalsIgnoreCase("payment")){
            return new PaymentServiceImpl() ;
        }else if(type.equalsIgnoreCase("reservation")){
            return new ReservationServiceImpl();
        }
        return null;
    } 
    
}
