package lesson_21;
// Для создания в Джава HAS-A - Ассоциации (связи) определяем поле в классе которое будет хранить
//ссылку на обьект другого класса
public class Autobus {

    private BusDriver driver;// агрегация( мягкая связь)
    private final  Autopilot autopilot;// композиция ( жесткая неразрывная связь)
    //final обозначает что ссылка один раз присваевается
    private int capacity;
    private final Passenger[] passengers; //
    private int countPassenger;

    public Autobus(BusDriver busDriver, int capacity) { // конструктор который будет принимать busDriver
        this.driver = busDriver;
        busDriver.setAutobus(this);
        autopilot = new Autopilot("AP-005");//при создании автомобиля создаем автопилот
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    //
    public boolean takePassenger(Passenger passenger) {
        //
        //
        //
        // Проверить, есть ли место в автобусе
        if (countPassenger < capacity) {
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.println("Пассажир зашел в автобус ");

            return true;
        } else {
            //
            System.out.println("Мест нет Посадить пассажира в автобус не удалось! ");
        }

        System.out.println("Пассажир успешно зашел в автобус");
        return true;

    }


    public Autopilot getAutopilot() {
        return autopilot;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
        driver.setAutobus(this);
    }

    public String toString() {// строка о состоянии нашего автобуса
        //TODO
        return "Autobus: {" + " driver: " + driver.getLicenseNumber() + "; autopilot: " + autopilot.getSoftwareVersion() + "}";

    }

    public String getStringPassengersList() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                Passenger current = passengers[i];
                stringBuilder.append("{ Passenger: id: ").append(current.getId()).append("; name:").append(current.getName()).append("}");
                stringBuilder.append("; ");
            }

        }
        //
        //
        if (stringBuilder.length() > 1) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }


        stringBuilder.append("}");
        return stringBuilder.toString();
    }


}




