public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation (int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid Reservation !, Please Fill Again With Different Number of Party");
        }

        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen == true) {
            System.out.println("Reservation confirmed for party of " + guestCount);
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied for party of " + guestCount);
            isConfirmed = false;
        }
    }

    public void informUser() {
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }


    public static void main(String[] args) {
        Reservation partyOfThree = new Reservation(3, 12, true);
        Reservation partyOfFour = new Reservation(4, 3, true);
        // Reservation partyOfTen  = new Reservation(10, 8, true);

        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        System.out.println();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}
