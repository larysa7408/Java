package homework.homework_25.transport;

public class Car extends Vehicle {

    public Car(Engine engine) {
        super();
        this.setEngine(engine);
    }

    public String toString9() {
        return "Car {id: " + getId() + "; engine: " + getEngine() + "}";
    }

    @Override
    public void startEngine() {
      if (getEngine()!= null){
          getEngine().start();
      }
    }
}
