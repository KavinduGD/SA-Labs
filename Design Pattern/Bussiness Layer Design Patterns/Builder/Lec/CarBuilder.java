package Builder.Lec;

public class CarBuilder  implements VehicleBuilder{

    Vehicle car;

    public CarBuilder() {
        car = new Car();
    }

    @Override
    public void tyreBuilder() {
        System.out.println("add car tyre");
        
    }

    @Override
    public void engineBuilder() {
       System.out.println("add car engine");
    }

    @Override
    public void chassisBuilder() {
        System.out.println("fix the chassis for the car");
    }

    @Override
    public void frameBuilder() {
        System.out.println("six the outer frame and finish the assemble work");
    }

    @Override
    public Vehicle getVehicle() {
        System.out.println("returning the car");
      return car;
    }
    
}
