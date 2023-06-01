package Builder.Lec;

public class Test {
    
        public static void main(String[] args) {

            VehicleBuilder carBuilder = new CarBuilder();
            VehicleAssembler assembler= new VehicleAssembler(carBuilder);
            assembler.assembleVehicle();
            assembler.getVehicle();

            System.out.println("=====================================");

            VehicleBuilder busBuilder = new BusBuilder();
            VehicleAssembler assembler1= new VehicleAssembler(busBuilder);
            assembler1.assembleVehicle();
            assembler1.getVehicle();

            

            
           
        }
    
}
