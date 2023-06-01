package TransferObject.com.easd.dto;

public class ReservationDTO {

    private String  ID;
    private int roomNo;
    private double amount;

    public String getID() {
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    
}
