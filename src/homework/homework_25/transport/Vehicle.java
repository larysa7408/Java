package homework.homework_25.transport;
/*
Задача 2.
 Создайте иерархию классов для разных типов Методические меры:
 Vehicle(родительский класс), Car, Bicycle и Motorcycle(дочерние классы).
 Родительский класс Vehicle должен иметь метод startEngine(),
 реализации которого не будет.
 Дочерние классы Car, Bicycle и Motorcycle
 необходимо переопределить метод startEngine()
 для запуска двигателя соответствующего типа (если есть).
 Создайте массив с эффектами разных типов.
 Используйте полиморфизм для метода вызова startEngine()
 каждого транспортного средства.
 */

public class Vehicle {
    private final long id;
    private static long idCounter;
    private Engine engine;

    public Vehicle() {
        this.id = idCounter++;
    }
    public void startEngine(){

    }

    public long getId() {
        return id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
