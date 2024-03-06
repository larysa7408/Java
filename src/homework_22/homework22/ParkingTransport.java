package homework_22.homework22;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #18
 *
 * @author Larysa Petrova
 * @version 6-Mar-24
 */

public class ParkingTransport {
    public static void main(String[] args) {
        GroundTransport groundTransport = new GroundTransport("black","Car Nissan 2023");
        SeaTransport seaTransport= new SeaTransport("red","Ship Mould King 13111");
        AirTransport airTransport=new AirTransport("wheit","Airplane Boeing 737");
    groundTransport.move();
    seaTransport.spot();
    airTransport.fly();
    }

}
