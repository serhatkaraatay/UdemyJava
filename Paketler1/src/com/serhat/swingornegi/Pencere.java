package com.serhat.swingornegi;

import javax.swing.*;

public class Pencere {
    private JFrame frame;

    public Pencere() {
        frame = new JFrame();
        JButton button1 = new JButton("Tıkla");
        button1.setBounds(130, 100, 100, 40);
        frame.add(button1);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
