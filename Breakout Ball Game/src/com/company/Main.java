package com.company;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Breakout Ball game");
        Gameplay gameplay = new Gameplay();
        frame.setBounds(200,50, 700, 600);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameplay);
    }
}
