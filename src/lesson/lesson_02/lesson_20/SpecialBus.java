package lesson.lesson_02.lesson_20;

public class SpecialBus extends Bus {
    //SpecialBus унаследуем от extends Bus
    private int bicyclePlaces;// добавляем места для велосипедов
    private int bicyclesCount; // сколько сейчас есть велосипедов в автобусе
    // по дефолту инициализируется 0


    public SpecialBus(String model, int yearManufactured, int capacity, int bicyclePlaces) {
        super(model, yearManufactured, capacity);
        this.bicyclePlaces = bicyclePlaces;
    }

    public boolean takePassengerWithBicycle() {
        // Есть ли место для
        // 1. Пассажира
        // 2. Велосипеда.
        // если место для обоих - обоих на борт
        // если для кого-то нет места - никого не садим в автобус
        boolean isFreeForBicycle = bicyclesCount < bicyclePlaces;

        //
        if (bicyclesCount < bicyclePlaces && takePassenger()) {
            boolean isPassengerEntry = takePassenger();//место для велосипеда есть, тогда пытаемся взять пассажира
            if ((isPassengerEntry)) {//  пассажира посадили в автобус
                // Если есть место для вело и пассажир сел в автобус
                bicyclesCount++; // берем на бор велосипед
                System.out.println("Пассажир и велосипед сели в автобус: " + getModel());
                return true;
            }

        }
        // здесь окажемся, если велосипед и/или пассажир не поместились в автобус
        System.out.println("пассажир и велосипед не поместились в автобус :" + getModel());
        return false;
    }

    public int getBicyclePlaces() {
        return bicyclePlaces;
    }


    public int getBicyclesCount() {
        return bicyclesCount;
    }

    public int example() {
        return super.getCapacity();
    }


}
