package Cars;

public class BMW extends Car {
    private String drivingMode;

    public BMW(String name, int speed, int trunkVolume, int fuelConsumption, String drivingMode) {
        super(name, speed, trunkVolume, fuelConsumption);
        this.drivingMode = drivingMode;
    }

    public String getDrivingMode() {
        return drivingMode;
    }

    public void setDrivingMode(String drivingMode) {
        this.drivingMode = drivingMode;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Driving Mode: " + drivingMode);
    }
}