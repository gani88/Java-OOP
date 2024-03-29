package com.gani.java_oop.CaseStudy;

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class Complex {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
