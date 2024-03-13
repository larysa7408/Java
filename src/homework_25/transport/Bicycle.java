package homework_25.transport;

public class Bicycle extends Vehicle{
    @Override
    public String toString() {
        return "Bicycle{id: " + getId() + "; engine: no engine just pedals }";
    }

    @Override
    public void startEngine() {
        System.out.println("no engine just pedals");
    }
}
