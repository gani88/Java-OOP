public class StoreTwo {
    // instance fields
    String productType;
    // int profit;
    double price;

    // constructor method
    public StoreTwo(String product, double initialPrice) {
        productType = product;
        // profit = 0;
        price = initialPrice;
    }

    // advertise method
    public void advertise() {
        // System.out.println("Come spend some money !");
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // greetCustomer method
    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // increasePrice method
    public void increasedPrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // main method
    public static void main(String[] args) {
        StoreTwo lemonadeStand = new StoreTwo("Lemonade", 3.75);
        System.out.println("Old Price : " + lemonadeStand.price);
        lemonadeStand.increasedPrice(1.5);
        String cookie = "Cookies";
        // StoreTwo cookieShop = new StoreTwo(cookie);

        // lemonadeStand.advertise();
        // System.out.println(cookieShop.profit);
        System.out.println("New Price : " + lemonadeStand.price);
        // cookieShop.advertise();
        // cookieShop.greetCustomer("Gani");
    }
}
