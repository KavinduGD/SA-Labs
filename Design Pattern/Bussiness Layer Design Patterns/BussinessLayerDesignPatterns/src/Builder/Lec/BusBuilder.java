package Builder.Lec;

public class BusBuilder  implements VehicleBuilder{

    Vehicle bus;

    public BusBuilder() {
        bus = new Bus();
    }
    @Override
    public void tyreBuilder() {
        System.out.println("add bus tyre");
    }

    @Override
    public void engineBuilder() {
        System.out.println("add bus engine");
    }

    @Override
    public void chassisBuilder() {
        System.out.println("fix the chassis for the bus");
    }

    @Override
    public void frameBuilder() {
        System.out.println("six the outer frame and finish the assemble work");
    }

    @Override
    public Vehicle getVehicle() {
        System.out.println("returning the bus");
        return bus;
        
    }
    
}
