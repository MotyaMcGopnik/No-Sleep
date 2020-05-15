package com.company;

import javax.swing.*;

public class jiggleMyPickle {
    public static void GUI() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jFrame.setVisible(true);
        jPanel.setSize(250,200);
        jFrame.setSize(125,100);
        jFrame.setTitle("Mouse Jiggle-inator 3000");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}