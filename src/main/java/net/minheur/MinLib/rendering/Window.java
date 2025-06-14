package net.minheur.MinLib.rendering;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private boolean isVisible = true;

    public Window(String windowName) {
        JPanel writing = new JPanel();
        writing.setBackground(Color.RED);


        setTitle(windowName);
        setSize(680, 680/16*9);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(isVisible);
        JLabel mot = new JLabel("TEST");
        writing.add(mot);
    }

    public void toggleVisible(boolean newState) {
        isVisible = newState;
    }

    public boolean getVisible() {
        return isVisible;
    }

    public void addNewLabel(String text) {

    }
}
