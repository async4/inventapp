package com.inventory.app_common;

import javax.swing.*;
import java.awt.*;


public class app_window extends JFrame {
    private final String WINDOW_TITLE = "Inventory App";
    private final Dimension WINDOW_SIZE = new Dimension(900, 600);

    public app_window() {
        // Pencere yeniden boyutlandirilamaz.
        this.setResizable(false);

        // Pencerenin basligi
        this.setTitle(WINDOW_TITLE);

        // Pencerenin boyutu (WIDTHxHEIGHT)
        this.setSize(WINDOW_SIZE);

        // Pencerenin kapatma dugmesine basilinca yapilacak olan islem.
        // Eger bu satir eklenmez ise carpi butonuna basilsa bile program arkaplanda calismaya devam eder.
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Pencerenin ekranda gosterilmesini sagliyoruz.
        this.setVisible(true);
    }
}
