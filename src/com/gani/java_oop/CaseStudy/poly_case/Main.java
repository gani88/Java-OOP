package com.gani.java_oop.CaseStudy.poly_case;

public class Main {

    public static void main(String[] args) {

//        Cat myCat = new Cat("Missy", 3, "Gani");
//
//        myCat.sound();


        CreditCard card1 = new CreditCard("BRI");
        card1.pay(300000.0);

        Paypal pal1 = new Paypal("Paypal");
        pal1.pay(900000.0);
    }
}
