package net.minheur.MinLib;

import net.minheur.MinLib.rendering.Window;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello ! MinLib is turned on.");

//        Window myTestWindow = new Window("myTest");
//        myTestWindow.setVisible(true);

        JPanel writing = new JPanel();
        writing.setBackground(Color.RED);

        JLabel mot = new JLabel("test");
        writing.add(mot);

        JFrame maFrame = new JFrame("ma frame");

        maFrame.setTitle("hello");
        maFrame.setSize(680, 680/16*9);
        maFrame.setLocationRelativeTo(null);
        maFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        maFrame.setVisible(true);

    }
}