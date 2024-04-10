package com.gani.java_oop;

class Base {
    private int baseValue;

    Base() {
        System.out.println("Base constructor");
        // Calling setup method inside constructor
        setup();
    }

    // Overridable method
    void setup() {
        System.out.println("Base setup");
    }

    int getBaseValue() {
        return baseValue;
    }
}

class Derived extends Base {
    private int derivedValue;

    Derived() {
        System.out.println("Derived constructor");
    }

    // Overriding the setup method
    @Override
    void setup() {
        derivedValue = 42;
        System.out.println("Derived setup with value: " + derivedValue);
    }

    int getDerivedValue() {
        return derivedValue;
    }
}

public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println("===============");
        System.out.println("Derived object value: " + d.getDerivedValue());
        System.out.println("===============");
        System.out.println("Base object value: " + d.getBaseValue());
    }
}
