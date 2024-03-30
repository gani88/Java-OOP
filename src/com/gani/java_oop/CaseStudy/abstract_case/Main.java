package com.gani.java_oop.CaseStudy.abstract_case;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(21.0, "Blue");


        circle1.setSize(12, 9);
        circle1.setColor("Red");

        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());

        circle1.draw();
    }
}
