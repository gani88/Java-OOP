package com.gani.java_oop.learn;

public enum Arah {
    NORTH, // 0
    EAST, // 1
    SOUTH,// 2
    WEST; // 3

    public Arah r() {
        return values()[(this.ordinal() + 1) % values().length];
    }
    public Arah l() {
        return values()[(this.ordinal() + values().length - 1) % values().length];
    }
}
