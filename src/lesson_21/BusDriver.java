package lesson_21;

public class BusDriver {
    private String licenseNumber;
    private Autobus autobus;// в классе BusDriver появлятеся автобус состояие которого можно высчитывать как автобусом теперь управлять
    // организация двунаправленной связи

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public BusDriver(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }


    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }
}
