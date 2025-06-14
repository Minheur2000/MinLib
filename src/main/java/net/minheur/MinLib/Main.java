package net.minheur.MinLib;

import net.minheur.MinLib.rendering.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("maFrame");
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello");
            }
        });
        window.add(button);

        JLabel text = new JLabel("HELLO !!!");
        window.add(text);

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(text);

        window.getContentPane().add(panel);

        window.setVisible(true);

    }
}