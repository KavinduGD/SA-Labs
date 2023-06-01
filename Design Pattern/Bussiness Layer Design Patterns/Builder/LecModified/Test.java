package Builder.LecModified;

public class Test {
    
        public static void main(String[] args) {

            VehicleBuilder carBuilder = new VehicleBuilder();
            CarAssembler assembler= new CarAssembler(carBuilder);
            assembler.assembleVehicle();
            Vehicle car=assembler.getVehicle();
            System.out.println(car);


            System.out.println("=====================================");

            VehicleBuilder busBuilder = new VehicleBuilder();
            BusAssembler assembler1= new BusAssembler(busBuilder);
            assembler1.assembleVehicle();
            assembler1.getVehicle();
            Vehicle bus=assembler1.getVehicle();
            System.out.println(bus);

            

            
           
        }
    
}
