package homework_16;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Audi", 60);
        PetrolStation petrolStation = new PetrolStation(1000);
        petrolStation.refuelCar(car, 100);
        System.out.println("Остаток топлива на заправке :" + petrolStation.fuelStock);
        System.out.println(" Остаток топлива в автомобиле :" + car.model + petrolStation.fuelStock);

    }
}
