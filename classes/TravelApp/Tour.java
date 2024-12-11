package TravelApp;

public class Tour {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private ToursPackage toursPackage;

    public Tour(int tourId, String tourName, double price, ToursPackage toursPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.toursPackage = toursPackage;
        this.isReserved = false;
    }

    public boolean reserve() {
        if (isReserved) {
            System.out.println("The tour is already reserved");
            return false;
        }
        isReserved = true;
        System.out.println("The tour is reserved successfully");
        return true;
    }

    public boolean cancel() {
        if (isReserved) {
            isReserved = false;
            System.out.println("The tour is cancelled successfully");
            return true;
        }
        System.out.println("The tour wasn't reversed");
        return false;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "tourId=" + tourId +
                ", tourName='" + tourName + '\'' +
                ", price=" + price +
                ", toursPackage=" + toursPackage +
                '}';
    }
}
