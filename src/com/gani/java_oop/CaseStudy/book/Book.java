package com.gani.java_oop.CaseStudy.book;

public class Book {

    String title = "Unknown";
    String author = "Unknown";

    public Book(){

    }
    public Book(String title) {
        this.title = title;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println("The title of the book is " + this.title + " and the author is " + this.author);
    }
}
