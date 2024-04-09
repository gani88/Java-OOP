package com.gani.java_oop.learn.application;

import com.gani.java_oop.learn.data.Car;
import com.gani.java_oop.learn.data.Tesla;

public class CarApp {
    public static void main(String[] args) {


        Car tesla = new Tesla();
        System.out.println(tesla.getTier());
        System.out.println(tesla.getBrand());
        System.out.println(tesla.isMaintenance());
        tesla.drive();
    }
}
