package com.gani.java_oop.learn.data;

import com.gani.java_oop.learn.data.Animals;

public class Cat extends Animals {

    public void run() {
        System.out.println("Cat " + super.name + " is Running");
    }
}
