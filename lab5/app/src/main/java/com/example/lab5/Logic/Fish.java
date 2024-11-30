package com.example.lab5.Logic;

public class Fish extends Animal implements Pet {
    private String name ;
    public Fish() {
        super(0);
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String play() {
        return  "Рыбка просто плавает";
    }

    public String getName() {
        return name;
    }
    @Override
    public String walk() {
        return "Рыбки, конечно, гулять не могут – они плавают";
    }
    @Override
    public String eat() {
        return "Рыбки едят червяков";
    }
    @Override
    public String toString() {
        return "Рыбки {" + "ног=" + legs +  ", имя='" + name + '\'' + ". "+
                walk()+ ". "+eat()+ ". "+play()+ '}';
    }
}