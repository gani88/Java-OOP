package com.gani.java_oop.InherPoly;

class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("HI " + name + ", My Name Is Employee " + this.name);
    }


}
