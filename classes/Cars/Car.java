package Cars;

public class Car {
    private String model;
    private int speed;
    private int trunkVolume;
    private int fuelConsumption;

    public String getName() {
        return model;
    }

    public void setName(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelCconsumption) {
        this.fuelConsumption = fuelCconsumption;
    }

    public Car(String name, int speed, int trunkVolume, int fuelConsumption) {
        this.model = name;
        this.speed = speed;
        this.trunkVolume = trunkVolume;
        this.fuelConsumption = fuelConsumption;
    }

    public Car() {

    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Speed: " + speed + " km/h" + ", Trunk Volume: " + trunkVolume + " L" + ", Fuel Consumption: " + fuelConsumption + " L/100km");
    }
}
