package com.gani.java_oop.CaseStudy.person;

public class Main {

    public static void main(String[] args) {

        Person ruth = new Person("Ruth", 14);
        Person michael = new Person("Michael", 17);
        Person lala = new Person("Lala", 14);

        ruth.speak();
        michael.speak();
        lala.speak();

        Person.displayCount(); // the method is static so it only the class have ability to call it
    }
}
