package com.gani.java_oop.CaseStudy.abstract_case;

public class Circle implements Shape {
    private double radius;
    private String color;


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setSize(double widht, double height) {
        this.radius = Math.max(widht, height) / 2;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a Circle with radius " + this.radius + " and with " + this.color + " color");
    }


}
