package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by regnisalram on 12/5/16.
 */
public class Player {
    String name;
    ArrayList<Card> played;

    int getValueOfPlayedCards() {
        played = new ArrayList<>();
        int sum = 0;
        for (Card card : played) {
            sum += card.getValue();
        }
        return sum;
    }

//    ArrayList<Card> addCardToPlayedCards() {
//        played.add(new Card());
//    }
}
