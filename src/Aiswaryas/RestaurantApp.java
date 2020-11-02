package Aiswaryas;

public class RestaurantApp {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("Flavor of India",25);

        r1.seatsParty(15);

        r1.removesParty(5);

        r1.availableSeats();

        r1.seatsParty(10);

        r1.printsRestaurantSummary();

    }
}
