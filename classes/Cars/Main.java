package Cars;

public class Main {
    public static void main(String[] args) {
        BMW bmwCar = new BMW("X5", 250, 650, 12, "Sport");
        Chevrolet chevroletCar = new Chevrolet("Malibu", 220, 450, 9, false);
        Hyundai hyundaiCar = new Hyundai("Elantra", 200, 400, 7);

        bmwCar.displayInfo();
        chevroletCar.displayInfo();
        hyundaiCar.displayInfo();
    }
}
