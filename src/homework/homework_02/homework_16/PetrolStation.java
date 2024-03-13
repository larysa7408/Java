package homework.homework_02.homework_16;

public class PetrolStation {
    int fuelStock;

    public PetrolStation(int fuelStock) {
        this.fuelStock = fuelStock;
    }

    public void refuelCar(Car car, int amount) {
        if (amount > fuelStock) {
            System.out.println("Недостаточно топлива на заправке");
            return;
        }
        car.addFuel(amount);
        fuelStock -= amount;
    }

}
