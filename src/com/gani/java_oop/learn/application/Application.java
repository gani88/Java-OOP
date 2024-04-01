package com.gani.java_oop.learn.application;

import com.gani.java_oop.learn.data.*;
import com.gani.java_oop.learn.data.Product;

public class Application {

    public static void main(String[] args) {
        Product product = new Product("Lenovo Thinkpad", 5_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
