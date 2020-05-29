package com.inventory.app_final.ui;

import com.inventory.app_final.pane_inventory.inventory;
import com.inventory.app_final.pane_weapons.weapons;

import javax.swing.*;
import java.awt.*;


public class content_pane extends JSplitPane {

    private final Color PANE_BORDER_COLOR = new Color(30, 29, 34);
    private final Color PANE_COLOR = new Color(23, 21, 26);
    private final int DIVIDER_LOC = 300;


    public content_pane() {
        // Ana Panelin yanlarinda beyazlik gorunmemesi icin border'ini degistiriyoruz.
        this.setBorder(BorderFactory.createLineBorder(PANE_BORDER_COLOR, 1));

        // Ana Panelin arkaplan rengi.
        this.setBackground(PANE_COLOR);

        // Ana panel JSplitPane adli siniftan miras aliyor. JSplitPane 2 paneli istenilen boyutta saga ve sola ekler.
        // Bu sinif sayesinde de 2 tane paneli ayni yerde görebiliyoruz.
        // JSplitPane eklenince ekranin ortasinda bir ayrac olur bunun sayesinde panelin boyutlarini istedigimiz gibi
        // ayarlayabiliyoruz. Ancak burada dinamik bir yapi yerine statik bir yapi seciyoruz ve panellerin yeniden
        // boyutlandirilmasini engellemek icin ortadaki ayraci kaldiriyoruz.
        this.setEnabled(false);
        this.setDividerSize(0);
        this.setOrientation(1);

        // Sol panele gelecek olan envanter paneli.
        weapons weapons_pane = new weapons();

        // Sag panele gelecek olan cizim paneli.
        inventory inventory_pane = new inventory();

        // Sol panele envanter panelini ekliyoruz.
        this.setLeftComponent(weapons_pane);

        // Sag panele cizim panelini ekliyoruz.
        this.setRightComponent(inventory_pane);

        // Ortada cikacak olan ayracin konumu. 300 WIDTH.
        // Yani sol panel 300 WIDTH uzunlugunda. Sag panel ise 600 WIDTH uzunlugunda olacktir.
        this.setDividerLocation(DIVIDER_LOC);
    }

}