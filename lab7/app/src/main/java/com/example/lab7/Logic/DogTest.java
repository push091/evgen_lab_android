package com.example.lab7.Logic;

import java.util.ArrayList;
import java.util.List;

public class DogTest {
    private List<Dog> dogList = new ArrayList<>();

    public void makeDogList() {
        dogList.clear();
        dogList.add(new Dog("Лабрадор", "Макс", 3));
        dogList.add(new Dog("Хаски", "Белла", 4));
        dogList.add(new Dog("Бульдог", "Чарли", 2));
        dogList.add(new Dog("Пудель", "Люси", 5));
        dogList.add(new Dog("Лабрадор", "Рокки", 6));
    }

    public String getDogsByBreed(String breed) {
        StringBuilder result = new StringBuilder();
        for (Dog dog : dogList) {
            if (dog.getBreed().equals(breed)) {
                result.append(dog.getName()).append(", возраст: ").append(dog.getAge()).append("\n");
            }
        }
        return result.toString();
    }
}
