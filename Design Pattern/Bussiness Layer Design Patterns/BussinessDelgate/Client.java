package BussinessDelgate;

public class Client {
	public static void main(String[] args) {
      
      BusinessDelegate businessDelegate = new BusinessDelegate();
       
      businessDelegate.setServiceType("EJB");
      businessDelegate.doTask();

      businessDelegate.setServiceType("JMS");
      businessDelegate.doTask();


   }

 }