package lesson_21;

public class BusDriver {
    private String licenseNumber;
    private Autobus autobus;

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
