package DesignPatern2022;

public class ReservationController implements FrontController{

        ReservationService reservationService;
        int room;

        public ReservationController (ReservationService reservationService,int room){
            this.reservationService= reservationService;
            this.room=room;
        }

  
        public void excute() {
                reservationService.reserveRooms(room);
          
        }


    
}
