package DesignPatern2022;

public class ReservationService {

    public static ReservationService uniqueObject;

    private ReservationService(){}

    public static ReservationService getInstance(){
        if(uniqueObject==null){
            uniqueObject= new ReservationService();
        }
        return uniqueObject;
    }

    public void reserveRooms(int roomNo){
        System.out.println("You reserve the room = " + roomNo);
    }
    
}
