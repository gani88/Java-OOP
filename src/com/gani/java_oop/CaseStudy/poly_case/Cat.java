package com.gani.java_oop.CaseStudy.poly_case;

class Cat extends Animal{

    private String owner;

    public Cat(String name, Integer age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    void sound() {
        System.out.println("Nyaaaa.....");
    }

}
