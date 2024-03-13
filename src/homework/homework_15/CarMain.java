package homework.homework_15;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.refuel(50.0); // заправляем автомобиль 50 литрами бензина
        car.startEngine(); // запускаем двигатель

        car.drive(100); // автомобиль проезжает 100 км

        car.drive(200); // пытаемся проехать 200 км, но в баке недостаточно бензина
    }

}
