package com.inventory.app_business.window_properties;

import javax.swing.*;
import java.awt.*;

public abstract class window_properties extends JFrame {
    public static final int WIDTH = 900, HEIGHT = 600;

    protected final String WINDOW_TITLE = "Inventory";
    protected final Dimension WINDOW_SIZE = new Dimension(WIDTH, HEIGHT);

    public window_properties() {
        // Pencere yeniden boyutlandirilamaz.
        this.setResizable(false);

        // Pencerenin basligi
        this.setTitle(WINDOW_TITLE);

        // Pencerenin boyutu (WIDTHxHEIGHT)
        this.setSize(WINDOW_SIZE);

        // Pencerenin ekranda gosterilmesini sagliyoruz.
        this.setVisible(true);
    }
}
