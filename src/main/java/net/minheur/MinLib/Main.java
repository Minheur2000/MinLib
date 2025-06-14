package net.minheur.MinLib;

import net.minheur.MinLib.rendering.Window;

import javax.swing.*;

public class Main {
    // public static final JButton button = new JButton("hello");


    public static void main(String[] args) {

        Window.initializeScreen("Hello");

        // JButton button = new JButton("hello");

        // Window.getFrame().add(button);
        // Window.getPanel().add(button);

        Window.frame.add(new JButton("helo"));
        Window.panel.add(new JButton("helo"));

    }
}