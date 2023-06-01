package Builder.LecModified;

public class VehicleBuilder {

    private int numOfTyres;
    private String engine;
    private String chassis;
    private String frame;
    private int acWindows;
    private int numOfCameras;


    public VehicleBuilder tyreBuilder(int tyre){
        this.numOfTyres = tyre;
        System.out.println("add  tyre");
        return this;
    }
    public VehicleBuilder engineBuilder(String engine){
        this.engine = engine;
        System.out.println("add  engine");
        return this;

    }
    public VehicleBuilder chassisBuilder(String Chassi){
        this.chassis = Chassi;
        System.out.println("fix the chassis for the ");
        return this;
    }

    public VehicleBuilder frameBuilder(String frame){
        this.frame = frame;
        System.out.println("six the outer frame and finish the assemble work");
        return this;
    }

    public VehicleBuilder acWindowsBuilder(int acWindows){
        this.acWindows = acWindows;
        System.out.println("add  acWindows");
        return this;
    }

    public VehicleBuilder numOfCamerasBuilder(int numOfCameras){
        this.numOfCameras = numOfCameras;
        System.out.println("add  numOfCameras");
        return this;
    }
    
    public Vehicle getCar(){
        return new Car(numOfTyres, engine, chassis, frame, acWindows);
    }

    public Vehicle getBus(){
        return new Bus(numOfTyres, engine, chassis, frame, numOfCameras);
    }


    
}
