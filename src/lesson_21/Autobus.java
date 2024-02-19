package lesson_21;

public class Autobus {
    // Для создания в Джава HAS-A - Ассоциации (связи) определяем поле в классе которое будет хранить
    //Которое будет хранить ссылку на обьект другого класса
    // Направленность связи -  однонаправленная или двунаправленная связь

    //Кардинальность связи определяет сколько обьектов одного класса может быть ассоциирована с обьектом другого класса
    /*
     Существует 3 разновидности связи

    -Один к одному Автобус и двигатель Каждый автобус может иметь только один автобус
    и на каждый двигатель только один автобус

   - Один ко многим Автобус и пассажиры Один автобус может перевозить много пассажиров
    У автобуса будет массив пассажиров

    -Многие ко многим Список автобусов и список остановок
    Каждый автобус может останавливаться на множество остановок
    Каждая остановка может обслуживать множество автобусов
     */

    private BusDriver driver;// агрегация( мягкая связь)
    private final  Autopilot autopilot;// композиция ( жесткая неразрывная связь)
    //final обозначает что ссылка один раз присваевается
    private int capacity;// вместимость нашего автобуса

    private final Passenger[] passengers; //
    private int countPassenger;

    public Autobus(BusDriver busDriver, int capacity) { // конструктор который будет принимать busDriver
        this.driver = busDriver;
        busDriver.setAutobus(this);
        //this мы находимся внутри автобуса ссылка на конкретный вид автобуса
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
        StringBuilder stringBuilder=new StringBuilder("Autyobus: {driver: ");
        stringBuilder.append(driver.getLicenseNumber()).append("; autopilot: ")
                .append(autopilot.getSoftwareVersion()).append(" }");
       // stringBuilder.append(createStringByPassengerList());stringBuilder.append("")
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




