package com.inventory.app_common;

import javax.swing.*;
import java.awt.*;


public abstract class window_properties extends JFrame {
    
    // Ekran genisligi ve yuksekligi.
    public static final int WIDTH = 900, HEIGHT = 600;
    
    // Ekran pencere basligi.
    protected final String WINDOW_TITLE = "Inventory";

    protected final Dimension WINDOW_SIZE = new Dimension(WIDTH, HEIGHT);
    
    // Kullanilan bilgisayarin cozunurluk bilgileri.
    private final Dimension SCREEN_RESOLUTION = Toolkit.getDefaultToolkit().getScreenSize();


    public window_properties() {
        
        // Ekran ortalanir.
        this.setLocation(
            (int)(SCREEN_RESOLUTION.getWidth() - WIDTH ) / 2,
            (int)(SCREEN_RESOLUTION.getHeight() - HEIGHT) / 2
        );

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