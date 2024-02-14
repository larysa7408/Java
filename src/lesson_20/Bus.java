package lesson_20;

public class Bus extends Vehicle {
    //  если мы хотим унаследоваться от какогото класса мы должны использовать ключевое слово extends и указать от какого класса хотим унаследоваться

    private int capacity; // дополняем наш автобус например вместимость
    private int countPassengers;// кол во пассажиров в автобусе // по умолчанию установлено в 0

    private static int totalPassengerCounter;//общее кол во пассажиров
//  если поле static ни к кому не пренадлежит
    public Bus(String model, int yearManufactured, int capacity) {
        // чтобы создать объект-родителя нам нужно вызвать его конструктор!
        super(model, yearManufactured);// вызов конструктора родителя
        // super при создании ребенка мы всегда должны вызвать его родителя
        System.out.println("Конструктор Bus продолжает выполнение!");
        this.capacity = capacity;
    }
    public boolean takePassenger() {// Метод для пассажира который пытается зайти в автобус
        // Проверить, есть ли место в автобусе
        if (countPassengers < capacity) { //Срасвниваем колво пассажиров с колво мест в автобусе
            //свободное место есть. Добавляем пассажира
            countPassengers++;// добавить +1 пассажир
            System.out.println("Пассажир зашел в автобус " + this.getModel());
            totalPassengerCounter++;
            return true;
        }

        System.out.println("Автобус полный! Пассажир не смог зайти");
        return false;
    }

    public void getOutPassenger() {
        // проверить, а есть ли сейчас в автобусе пассажиры
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса " + this.getModel());// this.getModel мы взяли у главного класса родителя ТС
        } else {
            System.out.println("Некому выходить - в автобусе больше нет пассажиров");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        //TODO надо проверять, есть ли "лишние" пассажиры в автобусе
        this.capacity = capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public static int getTotalPassengerCounter() {
        return totalPassengerCounter;
    }
}
