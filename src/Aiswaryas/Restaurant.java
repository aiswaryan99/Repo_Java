package Aiswaryas;

public class Restaurant {

    final String name;
    final int guestCap;
    int guestCount;
    int availSeat;

    Restaurant(String newName,int newCapacity) {
        name = newName;
        guestCap = newCapacity;
        availSeat = guestCap - guestCount;
    }

    public void availableSeats(){
        System.out.println("Number of Seats Available: " + availSeat);
    }

    public void seatsParty(int numOfGuests){
        if(availSeat >= numOfGuests) {
            guestCount += numOfGuests;
            availSeat -= numOfGuests;
        }
        else System.out.println("No more seats available !");
    }

    public void removesParty(int numOfGuests){
        if (guestCount >= numOfGuests) {
            availSeat += numOfGuests;
            guestCount -= numOfGuests;
        }
        else System.out.println("Not enough guests to remove!");
    }

    public void printsRestaurantSummary() {
        System.out.println("Name: " + name +
                "\nTotal Capacity: " + guestCap +
                "\nGuest Count: " + guestCount +
                "\nAvailable Seats: " + availSeat);
    }
}