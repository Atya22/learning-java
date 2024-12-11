package TravelApp;

public class Main {
    public static void main(String[] args) {
        Tour tourForFriday = new Tour(5, "Explore Baku", 45.99, ToursPackage.CITY_TOUR);
        Tour tourForSaturday = new Tour(6, "Explore Gobustan desert safari", 20.00, ToursPackage.DESERT_SAFARI);
        Tour tourForSunday = new Tour(7, "Adventure in Shaxdag", 80.00, ToursPackage.MOUNTAIN_ADVENTURE);

        Customer customer1 = new Customer(54);
        Customer customer2 = new Customer(76);
        Customer customer3 = new Customer(89);

        customer1.reserveTour(tourForFriday);
        customer1.reserveTour(tourForSunday);
        System.out.println(customer1.toString());

        System.out.println("-------------------------------");

        TourAgency exploreAzerbaijan = new TourAgency("Explore Azerbaijan");
        exploreAzerbaijan.addCustomer(customer1);
        exploreAzerbaijan.addCustomer(customer2);
        exploreAzerbaijan.addCustomer(customer3);
        System.out.println(exploreAzerbaijan.toString());
        exploreAzerbaijan.removeCustomer(customer3);
        System.out.println(exploreAzerbaijan.toString());
        System.out.println(customer1.getReservedTours());
        customer1.cancelTour(tourForFriday);

        exploreAzerbaijan.addTour(tourForFriday);
        exploreAzerbaijan.addTour(tourForSaturday);
        exploreAzerbaijan.addTour(tourForSunday);

        System.out.println(exploreAzerbaijan.toString());
        exploreAzerbaijan.removeTour(tourForSaturday);

    }
}
