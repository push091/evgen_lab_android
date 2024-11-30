package com.example.lab4.logic;

public class DogTest {
    Dog[] dogArr = new Dog[3];

    public void createArrEmp(){
        dogArr[0] = new Dog("Шуша", "Золотистый ретривер");
        dogArr[1] = new Dog( "Рекс", "Лабрадор");
        dogArr[2] = new Dog( "Буба", "Мопс");
    }
    public Dog[] getArrEmp() {
        return dogArr;
    }
    }
