package net.minheur.MinLib.rendering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    public static final JFrame frame = new JFrame();
    public static final JPanel panel = new JPanel();

    public static void initializeScreen(String name) {
        frame.setTitle(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // JButton button = new JButton("helloo");
        // frame.add(button);
        // panel.add(button);

        frame.getContentPane().add(panel);

        frame.setVisible(true);

    }

    public static void hideScreen() {
        frame.setVisible(false);
    }
    public static void showScreen() {
        frame.setVisible(true);
    }

    public static void addButton(String buttonName) {
        JButton button = new JButton(buttonName);
        panel.add(button);
        frame.add(button);
    }
    public static void removeButton(int buttonId) {
        panel.remove(buttonId);
        frame.remove(buttonId);
    }

    public static JFrame getFrame() {
        return frame;
    }
    public static JPanel getPanel() {
        return panel;
    }

}
