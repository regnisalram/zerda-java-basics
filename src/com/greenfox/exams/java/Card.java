package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by regnisalram on 12/5/16.
 */
public class Card {

    String color;
    int value;

    Card (String color, int value) {
        this.color = color;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return color + " " + value;
    }
}
