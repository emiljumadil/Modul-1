package Day8;
import java.math.BigDecimal;

public class Ticketing {
    private String userID;
    private String eventName;
    private double price;

    public Ticketing(String userID, String eventName, double price) {
        this.userID = userID;
        this.eventName = eventName;
        this.price = price;
    }
    public String getUserID(){
        return userID;
    }

    public String event() {
        return eventName;
    }

    public String price() {
        return String.valueOf(price);
    }
}
