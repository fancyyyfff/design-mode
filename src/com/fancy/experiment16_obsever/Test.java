package com.fancy.experiment16_obsever;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.addObserver(new Mouse());
        cat.addObserver(new Master());
        cat.cry();
    }
}
