package com.gani.java_oop.learn.application;

import com.gani.java_oop.learn.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("Ini ID");
        category.setId(null); // tidak akan dianggap karena sudah ada kondisi di setter.
        System.out.println(category.getId());
    }
}
