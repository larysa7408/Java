package homework_20;

public class Clothing extends Product {
    private String size;
    private String color;

    public Clothing (String name, Double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
