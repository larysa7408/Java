package homework_20;

public class Electronics extends Product{
    private String model;
    private String manufacturer;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Electronics(String name, Double price, String model, String manufacturer) {
        super(name, price);
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
