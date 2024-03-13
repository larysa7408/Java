package homework.homework_22.homework22;

public class AirTransport extends Transport {
    public AirTransport(String color, String model) {
        super(color, model);
    }

    protected void fly() {
        System.out.println(model + " Flies in the sky");
    }
}
