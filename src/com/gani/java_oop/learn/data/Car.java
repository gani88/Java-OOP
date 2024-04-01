package com.gani.java_oop.learn.data;

public interface Car extends HasBrand, IsMaintenance{

//    Integer age; // field di interface harus ada isinya/constant
//    String name = "Zarek"; // seperti ini.

    void drive();
    Integer getTier();
}

