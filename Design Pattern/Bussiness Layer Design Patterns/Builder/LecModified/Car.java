package Builder.LecModified;

public class Car extends Vehicle {

    
    private int acWindows;

    public Car(int numOfTyres, String engine, String chassis, String frame, int acWindows) {
        super(numOfTyres, engine, chassis, frame);
        this.acWindows = acWindows;
    }

    @Override
    public String toString() {
        return ("Car{"+"numOf tyres="+this.numOfTyres+", engine="+this.engine+", chassis="+this.chassis+", frame="+this.frame+", acWindows="+this.acWindows+"}");
    }

}
