package homework.homework_25.transport;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #25
 *
 * @author Larysa Petrova
 * @version 13-MAR-24
 */


public class TransportHW {
    public static void main(String[] args) {

        Engine engine = new Engine(150, "Diesel");
        Engine bikeEngine = new Engine(150,"Elektro");

        Vehicle[]vehicles=new Vehicle[3];

         vehicles[0]=new Car(engine);
         vehicles[1]=new Bicycle();
         vehicles[2]=new Motorcycle(bikeEngine);

        for (int i = 0; i < vehicles.length ; i++) {
            Vehicle vehicle = vehicles[i];
            System.out.println(vehicle);
            vehicle.startEngine();
        }

         for (Vehicle currentVehicle : vehicles){
             System.out.println(currentVehicle);
             currentVehicle.startEngine();
             System.out.println();
         }
    }
}
