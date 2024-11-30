package com.example.lab5.Logic;

public class Parrot extends Animal  implements Pet {
    private String name;
    public Parrot() {
        super(2);
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String play() {
        return "Любит сидеть на плече";
    }

    public String getName() {
        return name;
    }
    @Override
    public String walk() {
        return "Попугаи могут как гулять, так и летать ";
    }
    @Override
    public String eat() {
        return "Попугаи питаются червяками и фруктиками";
    }
    @Override
    public String toString() {
        return "Попугаи {" + "ног=" + legs +  ", имя='" + name + '\'' + ". "+
                walk()+ ". "+eat()+ ". "+play()+ '}';
    }
}