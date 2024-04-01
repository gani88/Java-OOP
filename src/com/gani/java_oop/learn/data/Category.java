package com.gani.java_oop.learn.data;

public class Category {
    private String id;
    private Boolean expensive;


    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }

    }
    public Boolean isExpensive() {
        return this.expensive;
    }
    public void setExpensive(Boolean expensive) {
        this.expensive = expensive;
    }
}

