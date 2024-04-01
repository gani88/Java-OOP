package com.gani.java_oop.learn.application;

import com.gani.java_oop.learn.data.Cat;
import com.gani.java_oop.learn.data.Animals;

public class AnimalApp {

    public static void main(String[] args) {
        Animals animals = new Cat();
        animals.name = "Kiky";
        animals.run();
    }
}
