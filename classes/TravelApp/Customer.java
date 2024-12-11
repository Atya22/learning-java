package TravelApp;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int custId;
    private List<Tour> reservedTours;

    public Customer(int custId) {
        this.custId = custId;
        this.reservedTours = new ArrayList();
    }

    public List<Tour> getReservedTours() {
        return reservedTours;
    }

    public void reserveTour(Tour tour) {
        if (tour.reserve()) {
            reservedTours.add(tour);
        }
    }

    public void cancelTour(Tour tour) {
        if (tour.cancel()) {
            reservedTours.remove(tour);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", reservedTours=" + reservedTours +
                '}';
    }
}
