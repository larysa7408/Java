package homework.homework_02.homework_22.homework22;

public class Transport {
    protected String color;
    protected String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Transport(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void move() {
        System.out.println(model + " Moves");
    }

    public void spot() {
        System.out.println(model + " Stops");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
