package com.gani.java_oop.CaseStudy.poly_case;

abstract class PaymentMethod {

        String nameMethod;
        abstract void pay(double amount);

        public PaymentMethod(String nameMethod) {
            this.nameMethod = nameMethod;
        }
}
