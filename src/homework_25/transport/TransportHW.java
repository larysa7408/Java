package homework_25.transport;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #25
 *
 * @author Larysa Petrova
 * @version 13-MAR-24
 */


public class TransportHW {
    public static void main(String[] args) {

        Engine engine = new Engine(150, "Diesel");
        Car car = new Car(engine);
        System.out.println(car);


    }
}
