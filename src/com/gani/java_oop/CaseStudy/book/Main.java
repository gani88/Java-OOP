package com.gani.java_oop.CaseStudy.book;

public class Main {

    public static void main(String[] args) {


      Book book1 = new Book();
      Book book2 = new Book("Intro to Classic Math", "Tartarus");
      Book book3 = new Book("Entry to Dream Wordl");

      book1.showBookInfo();
      book2.showBookInfo();
      book3.showBookInfo();
    }
}
