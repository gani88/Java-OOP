package com.gani.java_oop.InherPoly;

class Parent {

    String name;

    void doIt() {
        System.out.println("Do it in parent class");
    }
}

class Child extends Parent{
    String name;

    void doIt() {
        System.out.println("Do it in child class");
        System.out.println("Parent name is " + super.name);
    }
}