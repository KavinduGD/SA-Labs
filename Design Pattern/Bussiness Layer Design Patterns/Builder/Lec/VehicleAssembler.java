package Builder.Lec;

public class VehicleAssembler {

    VehicleBuilder builder;

    public VehicleAssembler(VehicleBuilder builder) {
        this.builder = builder;
    }

    public void assembleVehicle() {
        System.out.println("start assembling the vehicle");
        builder.chassisBuilder();
        builder.engineBuilder();
        builder.frameBuilder();
        builder.tyreBuilder();   
    }

    public Vehicle getVehicle() {
        return builder.getVehicle();
    }
    


    
}
