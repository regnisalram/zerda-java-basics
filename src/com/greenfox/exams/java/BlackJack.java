package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by regnisalram on 12/5/16.
 */
public class BlackJack extends JPanel implements ActionListener {

    JButton draw, reset;
    JLabel userLabel, houseLabel;
    Player player, house;
    Deck deck;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackJack();
            }
        });
    }

    BlackJack() {

        userLabel = new JLabel("User played: ");
        this.add(userLabel);

        houseLabel = new JLabel("House played: ");
        this.add(houseLabel);

        draw = new JButton("Draw a card");
        draw.addActionListener(this);
        this.add(draw);

        reset = new JButton("New Game");
        reset.addActionListener(this);
        this.add(reset);

        this.setVisible(true);

        newGame();
    }

    void newGame() {
        deck = new Deck();
        player = new Player("Player");
        house = new Player("House");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(reset)) {
            newGame();
        } else if (e.getSource().equals(draw)) {
            deck.drawACard();
//            userLabel.setText(userLabel + drawnCard ); something like this should happen
        }
    }
}
