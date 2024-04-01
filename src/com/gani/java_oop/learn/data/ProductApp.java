package com.gani.java_oop.learn.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Lenovo Thinkpad", 5_0000_000);
        System.out.println(product.name);
        System.out.println(product.price);

    }
}
