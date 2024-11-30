package com.example.lr3.logic;

public class Logic {
    private int x = 0;


    public void setX(int x) {
        this.x = x;
    }

    public int getResult() {
        int y = 0;
        if (x < 3) {
            for (int i = 3; i <= 12; i++) {
                y = y + i;
            }
        } else {
            y = 45;
        }
        return y;
    }

    public String getString() {
        return "Если x<3, то y=сумме чисел от 3 до 12, иначе у=45";

    }
}