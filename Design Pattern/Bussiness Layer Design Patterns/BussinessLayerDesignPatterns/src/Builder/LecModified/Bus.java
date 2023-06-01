package Builder.LecModified;

public class Bus extends Vehicle{
    private int numOfCameras;

    public Bus(int numOfTyres, String engine, String chassis, String frame, int numOfCameras) {
        super(numOfTyres, engine, chassis, frame);
        this.numOfCameras = numOfCameras;
       
    }


    @Override
    public String toString() {
        return ("Bus{"+"numOf tyres="+this.numOfTyres+", engine="+this.engine+", chassis="+this.chassis+", frame="+this.frame+", numOfCameras="+this.numOfCameras+"}");
    }
 

    
}
