package com.gani.java_oop.InherPoly;

class Manager extends Employee {

    String company;
    String lastName;

    public Manager(String name) {
        super(name);
    }
    public Manager(String name, String company) {
        super(name);
        this.company = company;
//        this.lastName = lastName;
    }
    void sayHello(String name) {
        System.out.println("HI " + name + ", My Name Is Manager " + this.name);
    }
    void sayHello(String name, String lastName) {
        System.out.println("HI " + name + ", My Name Is Employee " + this.name + " " + lastName);
    }
    int salary() {
        return 5_000_000;
    }
}
