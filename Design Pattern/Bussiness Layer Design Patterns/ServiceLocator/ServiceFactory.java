package ServiceLocator;

public class ServiceFactory {

    public Service createService(String servicename) {
        if(servicename.equalsIgnoreCase("s1")){
            return new Service1();
        }
        if(servicename.equalsIgnoreCase("s2")){
            return new Service2();
        }
        return null;
    }
    
}
