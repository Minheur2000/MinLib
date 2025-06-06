package net.minheur.MinLib.rendering;

import javax.swing.*;

public class ScreenItem extends JFrame {
    private final int ID;
    private boolean isVisible = false;

    public ScreenItem(int id, int defaultCloseOperation, String name) {
        this.ID = id;
        super.setName(name);
        super.setDefaultCloseOperation(defaultCloseOperation);
    }

    public void setScreenName(String name) {
        this.setName(name);
    }

    public void setScreenSize(int height, int width) {
        super.setSize(width, height);
    }

    public int getID() {
        return ID;
    }

    public void setScreenVisibility(boolean isVisible) {
        this.isVisible = isVisible;
        super.setVisible(this.isVisible);
    }

    @Override
    public boolean isVisible() {
        return isVisible;
    }
}
