package com.example.lab5.Logic;

public class Spider extends Animal {
    public Spider() {
        super(8);
    }
    @Override
    public String eat() {
        return "Паук ест мух";
    }
    @Override
    public String toString() {
        return "Паук {" + "ног=" + legs +  ". " +eat()+ '}';
    }
}
