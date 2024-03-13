package homework.homework_02.homework_23;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quartity) {
        this.name = name;
        this.quantity = quartity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
