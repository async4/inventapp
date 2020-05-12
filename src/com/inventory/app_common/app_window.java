package com.inventory.app_common;

import javax.swing.*;


public class app_window extends JFrame {
    public app_window() {
        // Pencere yeniden boyutlandirilamaz.
        this.setResizable(false);

        // Pencerenin basligi
        this.setTitle("InventApp");

        // Pencerenin boyutu (WIDTHxHEIGHT)
        this.setSize(900, 600);

        // Pencerenin kapatma dugmesine basilinca yapilacak olan islem.
        // Eger bu satir eklenmez ise carpi butonuna basilsa bile program arkaplanda calismaya devam eder.
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Pencerenin ekranda gosterilmesini sagliyoruz.
        this.setVisible(true);
    }
}
