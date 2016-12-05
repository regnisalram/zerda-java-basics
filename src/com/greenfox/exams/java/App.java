package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;

/**
 * Created by regnisalram on 12/5/16.
 */
public class App extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }

    void App() {

        this.setTitle("BlackJack Game");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();

        int xPos = (dimension.width/2 - this.getWidth()/2);
        int yPos = (dimension.height/2 - this.getHeight()/2);

        this.setLocation(xPos, yPos);

        this.add(new BlackJack());

        pack();
        this.setVisible(true);
    }
}

