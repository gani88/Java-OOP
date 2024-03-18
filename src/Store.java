public class Store {

    // Declare instance field
    String productType;
    int number_id;
    int inventoryCount;
    double inventoryPrice;

    // method : Constructor
    public Store(String product, int count, double price) {
        // System.out.println("I am inside constructor method.");

        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    public Store(String product, int id) {
        productType = product;
        number_id = id;
    }

    // main method where we create instance
    public static void main(String[] args) {
        System.out.println("Start of the main method.");
        System.out.println();

        // Creating instance
        // Store lemonadeStand = new Store("lemonade");
        // Store sepatuStore = new Store("sepatu", 1);
        Store cookieShop = new Store("cookies", 12, 3.75);

        // Print the instance
        // System.out.println(lemonadeStand.productType);
        // System.out.println(sepatuStore.number_id);
        System.out.println(cookieShop.productType);
        System.out.println(cookieShop.inventoryCount);
        System.out.println(cookieShop.inventoryPrice);
    }

}
