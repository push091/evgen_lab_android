package com.example.lab5.Logic;

public class Cat extends Animal implements Pet {
    private String name;
    public Cat(String name) {
        super(4);
        this.name = name;
    }
    public Cat() {
        this("Мурка");
    }
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String play() {
        return name + " любит играть с веревочкой";
    }

    @Override
    public String eat() {
        return "Кошки любят есть пауков и рыбок";
    }
    @Override
    public String toString() {
        return "Кошка {" + "ног=" + legs +  ", имя='" + name + '\'' + ". "+
                walk()+ ". "+eat()+ ". "+play()+ '}';
    }
}
