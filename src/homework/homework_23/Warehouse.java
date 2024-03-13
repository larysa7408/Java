package homework.homework_23;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<ProductAndCount> products;

    public Warehouse() {
        products = new ArrayList<>();
    }

    public void addAll(List<ProductAndCount> products) {
        //TODO analize and find some problem
        this.products.addAll(products);
    }

    public void deleteAll(List<ProductAndCount> products) {
        //TODO check count and etc
        for (ProductAndCount pac : products) {
            Product product = pac.getProduct();
            int count = pac.getCount();
            for (ProductAndCount whpac : this.products) {
                if (whpac.getProduct().equals(product)) {
                    whpac.setCount(whpac.getCount() - pac.getCount());
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "products=" + products +
                '}';
    }
}
