package com.example.lab5.Logic;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    List<Animal> animalList = new ArrayList<>();

    public void createAnimalList() {
        animalList.add(new Spider());
        animalList.add(new Cat("Том"));
        animalList.add(new Cat());
        Fish f = new Fish();
        Parrot p = new Parrot();
        f.setName("Гуппи");
        p.setName("Кеша");
        animalList.add(f);
        animalList.add(p);
    }
    public List <Animal> getAnimalList() {
        return animalList;
    }

    public List <Spider> getSpiderList() {
        List<Spider> spList = new ArrayList<>();
        for (Animal animal : animalList) {
            if (animal instanceof Spider)
                spList.add((Spider) animal);
        }
        return spList;
    }
    public List <Cat> getCatList() {
        List<Cat> catList = new ArrayList<>();
        for (Animal animal : animalList) {
            if (animal instanceof Cat)
                catList.add((Cat) animal);
        }
        return catList;
    }
    public List <Fish> getFishList () {
        List<Fish> fishList= new ArrayList<>();
        for (Animal animal : animalList) {
            if (animal instanceof Fish)
                fishList.add((Fish) animal);
        }
        return fishList;
    }

    public List <Parrot> getParrotList () {
        List<Parrot> parrotList= new ArrayList<>();
        for (Animal animal : animalList) {
            if (animal instanceof Parrot)
                parrotList.add((Parrot) animal);
        }
        return parrotList;
    }
}
