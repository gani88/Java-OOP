package com.gani.java_oop.InherPoly;

class VicePresident extends Manager {


    public VicePresident(String name) {
        super(name);
    }
    void sayHello(String name) {
        System.out.println("HI " + name + ", My Name Is Vice Manager " + this.name);
    }

    int salary() {
        return 4_000_000;
    }

    int getSalary() {
       return super.salary();
    }
}
