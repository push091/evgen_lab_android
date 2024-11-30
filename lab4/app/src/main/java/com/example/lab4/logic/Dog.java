package com.example.lab4.logic;

public class Dog {
    public String name;
    public String breed;


    public Dog( String name, String breed ) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
