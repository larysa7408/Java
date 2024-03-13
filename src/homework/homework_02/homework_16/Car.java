package homework.homework_02.homework_16;

public class Car {
    String model;
    int fuelLevel;

    public Car(String model, int fuelLevel) {
        this.model = model;
        this.fuelLevel = 0;
    }

    public void addFuel(int amount) {
        fuelLevel += amount;
        System.out.println("Заправим " + model + " на " + amount + "литров");
    }
}
