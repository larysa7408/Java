package homework.homework_23;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<ProductAndCount> products;

    public Warehouse() {
        products = new ArrayList<>();
    }

    public void addAll(List<ProductAndCount> products) {
        for (ProductAndCount pac : products) {
            Product product = pac.getProduct();
            int count = pac.getCount();
            boolean found = false;
            for (ProductAndCount whpac : this.products) {
                if (whpac.getProduct().equals(product)) {
                    whpac.setCount(whpac.getCount() + count);
                    found = true;
                    break;
                }
            }
            if (!found) {
                this.products.add(pac);
            }
        }
    }

    public void deleteAll(List<ProductAndCount> products) {
        for (ProductAndCount pac : products) {
            Product product = pac.getProduct();
            int count = pac.getCount();
            boolean found = false;
            for (ProductAndCount whpac : this.products) {
                if (whpac.getProduct().equals(product)) {
                    //  check if we can decrease count of product
                    if (whpac.getCount() >= count) {
                        whpac.setCount(whpac.getCount() - count);
                        found = true;
                        break;
                    } else {
                        //TODO exception: not enough of product
                    }
                }
            }
            if (!found) {
                //TODO exception: product not
            }
        }
    }

    @Override
    public String toString() {
        return "Warehouse{" + products + '}';
    }
}
