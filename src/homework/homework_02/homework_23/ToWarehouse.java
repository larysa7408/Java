package homework.homework_02.homework_23;

public class ToWarehouse {
    private String productId;
    private int quantity;

    public ToWarehouse(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
