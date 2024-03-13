package lesson.lesson_21;

public class AvtoParkMain {
    public static void main(String[] args) {


        BusDriver busDriver = new BusDriver("LN-19549459");
        //Cоздаем водителя автобуса
        Autobus bus = new Autobus(busDriver, 25);
        // создаем автобус
        System.out.println(bus.toString());// инфо о нашем автобусе
        BusDriver busDriver1 = new BusDriver("AE-545434435");
        bus.setDriver(busDriver1);
        System.out.println(bus.toString());

        Passenger passenger = new Passenger("John");
        Passenger passenger1 = new Passenger("Margo");
        Passenger passenger2 = new Passenger("Peter");
        Passenger passenger3 = new Passenger("Hanna");
        Passenger passenger4 = new Passenger("Sebastian");

        bus.takePassenger(passenger);
        bus.takePassenger(passenger1);
        bus.takePassenger(passenger2);
        bus.takePassenger(passenger3);
        bus.takePassenger(passenger4);

        bus.takePassenger(new Passenger("Test"));
        System.out.println(bus.getStringPassengersList());

    }
}
