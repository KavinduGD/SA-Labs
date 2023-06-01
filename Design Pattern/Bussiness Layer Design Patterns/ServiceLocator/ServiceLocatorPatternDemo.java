package ServiceLocator;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
 
      ServiceLocator locator= ServiceLocator.getInstance();
      Service service1=  locator.getService("s1");

      service1.execute();
    }
 }