package TravleApp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TourAgency {
    private String agencyName;
    private List<Tour> agencyTours;
    private Set<Customer> agencyCustomers;

    public TourAgency(String agencyName) {
        this.agencyName = agencyName;
        this.agencyTours = new ArrayList<>();
        this.agencyCustomers = new HashSet<>();
    }


    public void addTour(Tour tour) {
        agencyTours.add(tour);
    }

    public void removeTour(Tour tour) {
        agencyTours.remove(tour);
    }

    public void addCustomer(Customer customer) {
        agencyCustomers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        agencyCustomers.remove(customer);
    }

    @Override
    public String toString() {
        return "TourAgency{" +
                "agencyName='" + agencyName + '\'' +
                ", agencyTours=" + agencyTours +
                ", agencyCustomers=" + agencyCustomers +
                '}';
    }
}
