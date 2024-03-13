package homework_25.transport;

public class Motorcycle extends Vehicle{
    public Motorcycle(Engine engine) {
        super();
        this.setEngine(engine);
    }

    @Override
    public String toString() {
        return "Motorcycle{id: " + getId() + "; engine: " + getEngine() + " }";
    }

    @Override
    public void startEngine() {
        if (getEngine()!= null){
            getEngine().start();
        }
    }
}
