package com.gani.java_oop.CaseStudy.poly_case;

class Animal {

    String name;
    Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}
