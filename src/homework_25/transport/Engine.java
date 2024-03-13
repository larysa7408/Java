package homework_25.transport;

public class Engine {
    private final long id;
    private static long idCounter;
    private int power;
    private final String typePower;
    private boolean isActive;

    public Engine(long id, String typePower) {
        this.id = idCounter++;
        this.typePower = typePower;
    }

    public void start() {
        if (!isActive) {
            isActive = true;
            System.out.println("Engine" + id + "is running");
        } else
            System.out.println("Engine working");
    }

    public void stop() {
        isActive = false;
        System.out.println("Engine id: %d stop\n" + id);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", power=" + power +
                ", isActive=" + isActive +
                '}';
    }

    public long getId() {
        return id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTypePower() {
        return typePower;
    }
}
