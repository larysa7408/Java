package lesson_18;

import java.util.concurrent.Callable;

public class Car {
    private static int countCar;
    private String model;
    private int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        countCar++;
    }

    public Car(String model) {
        this.model = model;
        countCar = 100;
    }

    public void info() {
        System.out.println("Car: " + this.model + " | power = " + powerPS + " | count: " + countCar);
    }

    public static int getCountCar() {

        return countCar;
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 200);
        car.info();

        Car car1 = new Car("VW", 300);
        Car car2 = new Car("Ford", 75);

        car1.model = "Stels";
        car1.info();

        System.out.println("Создано всего автомобилей: " + Car.countCar);

        Car car3 = new Car("Model");

        car3.info();
        System.out.println("Создано всего автомобилей: " + Car.countCar);

        car1.info();


    }

}
