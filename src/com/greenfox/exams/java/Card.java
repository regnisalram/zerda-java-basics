package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by regnisalram on 12/5/16.
 */
public class Card {

    String color;
    int value;

    String[] colors = {"treff", "karo", "kor", "pikk"};
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "color" + " " + "value";
    }
}
