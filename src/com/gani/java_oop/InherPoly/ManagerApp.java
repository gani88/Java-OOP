package com.gani.java_oop.InherPoly;

public class ManagerApp {

    public static void main(String[] args) {
        Manager manager = new Manager("Eko");
        manager.sayHello("Budi");
        manager.sayHello("Fairuz", "Ulmu");

        //System.out.println(manager.salary());

        VicePresident vicePresident = new VicePresident("Joko");
        vicePresident.sayHello("Budi");

//        System.out.println(vicePresident.name + " Salary is " + vicePresident.getSalary());
        System.out.println(vicePresident.name + " Salary is " + vicePresident.salary());
    }
}
