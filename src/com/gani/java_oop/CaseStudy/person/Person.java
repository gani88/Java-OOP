package com.gani.java_oop.CaseStudy.person;

class Person {
    String name;
    int age;
//    This static variable is used to count how many Object Person created
    static int personCount = 0;

    public Person() {
        personCount++; // Increment the personCount variable whenever a new Person Object created
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        personCount++;
    }

    public void speak() {
        System.out.println("My name is " + this.name + " with the age of " + this.age + " and I'm speaking to You");
    }

    public static void displayCount() {
        System.out.println("The total number of Object Person created : " + personCount);
    }


}
