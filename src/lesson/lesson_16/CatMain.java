package lesson.lesson_16;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat(10);
        Plate plate = new Plate(20);
        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);

        plate.add(40);
        cat.eat(plate);
        // plate.feeding(plate.amountFood());

        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);


        int numOfCats = 5; // количество котов
        int plateCapacity = 20; // вместимость тарелки

        // Создание тарелки
        Plate plate1 = new Plate(plateCapacity);

        // Создание массива котов
        Cat[] cats = new Cat[numOfCats];
        cats[0] = new Cat(5); // уровень аппетита первого кота
        cats[1] = new Cat(7); // уровень аппетита второго кота
        cats[2] = new Cat(3); // уровень аппетита третьего кота
        cats[3] = new Cat(8); // уровень аппетита четвертого кота
        cats[4] = new Cat(6); // уровень аппетита пятого кота

        for (int i = 0; i < numOfCats; i++) {
            cats[i].eat(plate);
            System.out.println("Кот " + (i + 1) + " поел. Уровень сытости: " + cats[i].realVolume);
        }

    }
}
