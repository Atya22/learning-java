package Cars;

public class Chevrolet extends Car {
    private boolean isElectric;

    public Chevrolet(String name, int speed, int trunkVolume, int fuelConsumption, boolean isElectric) {
        super(name, speed, trunkVolume, fuelConsumption);
        this.isElectric = isElectric;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
    }
}
