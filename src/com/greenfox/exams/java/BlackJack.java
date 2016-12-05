package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by regnisalram on 12/5/16.
 */
public class BlackJack extends JPanel implements ActionListener {

    JButton draw, reset;
    JLabel user, house;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackJack();
            }
        });
    }

    void BlackJack () {

        user = new JLabel("User played: ");
        this.add(user);

        house = new JLabel("House played: ");
        this.add(house);

        draw = new JButton("Draw a card");
        draw.addActionListener(this);
        this.add(draw);

        reset = new JButton("New Game");
        reset.addActionListener(this);
        this.add(reset);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(reset)) {

        } else if (e.getSource().equals(draw)) {

        }
    }
}
