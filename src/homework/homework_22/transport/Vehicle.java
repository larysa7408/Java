package homework.homework_22.transport;

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
