package com.gani.java_oop.InherPoly;

public class ParentApp {

    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Atros";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child;
        parent.doIt();
        System.out.println(parent.name);
    }


}
