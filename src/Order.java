public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    public Order (boolean filled, double cost, String shippingMethod, String coupon) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        } else {
            System.out.println("Low value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        couponCode = coupon;
    }

    // ship method
    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost of " + shipping + " : " + calculateShipping());
        } else {
            System.out.println("Order not ready!");
        }
    }

    // calculate method to calculate price of shipping
    public double calculateShipping() {
        if (shipping == "Regular") {
            return 0;
        } else if (shipping == "Express") {
            if (couponCode == "ship50") {
                return .85;
            } else {
                return 1.75;
            }
        } else {
            return .50;
        }
    }

    public static void main(String[] args) {
        Order laptop = new Order(true, 67.50, "Express", "ship50");
        Order coffee = new Order(true, 4.00, "Express", "free shipping");

        laptop.ship();
        coffee.ship();
    }
}
