package com.example.lab5.Logic;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs) {
        this.legs = legs;
    }
    public String walk() {
        return "Это животное гуляет на " + legs + " ногах";
    }
    public abstract String eat();
}
