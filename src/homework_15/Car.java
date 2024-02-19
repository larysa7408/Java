package homework_15;

public class Car {
    private boolean startEngine;
    private double refuel;

    public Car() {
        startEngine = false;
        refuel = 0.0;
    }

    public void refuel(double amount) {
        refuel += amount;
    }

    public void startEngine() {
        if (refuel > 0) {
            startEngine = true;
            System.out.println("Запускаем двигатель");
        } else {
            System.out.println("Нет топлива для запуска двигателя");
        }
    }

    public void drive(int distance) {
        if (startEngine) {
            if (refuel >= distance * 0.1) {
                refuel -= distance * 0.1;
                System.out.println("Driving " + distance + " km");
            } else {
                System.out.println("Недостаточно топлива для езды");
            }
        } else {
            System.out.println("Двигатель не запускается");
        }
    }

}
