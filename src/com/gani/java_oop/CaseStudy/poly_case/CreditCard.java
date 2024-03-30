package com.gani.java_oop.CaseStudy.poly_case;

class CreditCard extends PaymentMethod {


    public CreditCard(String nameMethod) {
        super(nameMethod);
    }

    @Override
    void pay(double amount) {
        System.out.println("Paid Rp " + amount + " using Credit Card");
    }
}
