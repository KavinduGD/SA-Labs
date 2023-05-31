package ServiceLocator;

public class ServiceLocator {

   private static ServiceLocator uniqueObject;
   
   public static ServiceLocator getInstance(){
   if(uniqueObject==null){
      uniqueObject= new ServiceLocator();

   }

   return uniqueObject;
}

   public Service getService(String ServiceName){
      InitialContext initialContext= new InitialContext();
      Service service =  initialContext.lookUp(ServiceName);
      return service;

}

}