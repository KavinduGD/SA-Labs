package Builder.LecModified;

public class BusAssembler {

    VehicleBuilder builder;

    public BusAssembler (VehicleBuilder builder) {
        this.builder = builder;
    }

    public void assembleVehicle() {
        System.out.println("start assembling the Bus");
        builder.tyreBuilder(4).engineBuilder("v8").chassisBuilder("chassis").frameBuilder("fornt,back").numOfCamerasBuilder(4);
         
    }

    public Vehicle getVehicle() {
        return builder.getBus();
    }
    
}
