package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by regnisalram on 12/5/16.
 */
public class Deck {

    ArrayList<Card> used = new ArrayList<>();
    ArrayList<Card> cards;

    String[] colors = {"treff", "karo", "kor", "pikk"};
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    Deck() {
        createDeck();
    }

    public ArrayList<Card> createDeck() {
        cards = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards.add(new Card(colors[i], values[j]));
            }
        }
        Collections.shuffle(cards);
        return cards;
    }

    public ArrayList<Card> drawACard() {
        if (cards.size() == 0) {
            return null;
        } else {
            Card drawnCard = cards.remove(0);
            used.add(drawnCard);
            return used;
        }
    }
}
