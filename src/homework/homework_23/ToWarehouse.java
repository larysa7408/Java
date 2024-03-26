package homework.homework_23;

import java.util.ArrayList;
import java.util.List;

public class ToWarehouse extends BaseDocument {
    public ToWarehouse(int id) {
        super(id);
    }

    public void toWarehouse(Warehouse warehouse, Manager manager) {
        if (this.manager != null) {
            return;

        }
        warehouse.addAll(products);
        this.manager = manager;
    }
}
