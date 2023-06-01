package TransferObject.com.easd.dto;

public class PaymentDTO {

    private String ID;
    private String description;
    private double amount;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
            this.amount = amount;
    }
    
}
