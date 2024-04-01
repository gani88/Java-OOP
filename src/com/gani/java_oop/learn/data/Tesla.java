package com.gani.java_oop.learn.data;

public class Tesla implements Car{

    @Override
    public void drive() {
        System.out.println("Driving My Tesla");
    }
    @Override
    public Integer getTier() {
        return 4;
    }

//     Ditambah getBrand karena interface Car menjadi child dari Interface HasBrand, sehingga apa yang ada di
//     di HasBrand harus juga diimplementasikan di Tesla.
    @Override
    public String getBrand() {
        return "Tesla";
    }

    public Boolean isMaintenance() {
        return false;
    }
}
