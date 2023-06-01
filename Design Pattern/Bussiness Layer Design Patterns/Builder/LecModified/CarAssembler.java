package Builder.LecModified;

public class CarAssembler {

    VehicleBuilder builder;

    public CarAssembler(VehicleBuilder builder) {
        this.builder = builder;
    }

    public void assembleVehicle() {
        System.out.println("start assembling the Car");
        builder.tyreBuilder(4).engineBuilder("v8").chassisBuilder("chassis").frameBuilder("fornt,back").acWindowsBuilder(4);
         
    }

    public Vehicle getVehicle() {
        return builder.getCar();
    }
    


    
}
