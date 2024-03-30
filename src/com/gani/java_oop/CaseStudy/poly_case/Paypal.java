package com.gani.java_oop.CaseStudy.poly_case;

class Paypal extends PaymentMethod{

    public Paypal(String nameMethod) {
        super(nameMethod);
    }

    void pay(double amount) {
        System.out.println("Paid Rp " + amount + " using Paypal");
    }
}
