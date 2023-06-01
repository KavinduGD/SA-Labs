package ServiceLocator;

public class InitialContext {

   private ServiceFactory serviceFactory;
   
   public Service lookUp(String servicename){
      serviceFactory= new ServiceFactory();
      Service service=serviceFactory.createService(servicename);
      return service;

   }
    
    
 }