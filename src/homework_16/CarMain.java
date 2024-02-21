package homework_16;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Audi", 100);
        PetrolStation petrolStation = new PetrolStation(100);
        petrolStation.refuelCar(car, 100);
        System.out.println("Остаток топлива на заправке :" + petrolStation.fuelStock);
        System.out.println(" Остаток топлива в автомобиле :" + car.model + petrolStation.fuelStock);

    }
}
