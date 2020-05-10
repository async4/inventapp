package com.invent.app_common;

import com.invent.app_common.window_canvas.app_canvas_pane;
import com.invent.app_common.window_inventory.app_inventory_pane;

import javax.swing.*;
import java.awt.*;

public class app_content_pane extends JSplitPane {
    public app_content_pane() {
        // Ana Panelin yanlarinda beyazlik gorunmemesi icin border'ini degistiriyoruz.
        this.setBorder(BorderFactory.createLineBorder(new Color(30, 29, 34), 1, false));

        // Ana Panelin arkaplan rengi.
        this.setBackground(new Color(23, 21, 26));

        // Ana panel JSplitPane adli siniftan miras aliyor. JSplitPane 2 paneli istenilen boyutta saga ve sola ekler.
        // Bu sinif sayesinde de 2 tane paneli ayni yerde görebiliyoruz.
        // JSplitPane eklenince ekranin ortasinda bir ayrac olur bunun sayesinde panelin boyutlarini istedigimiz gibi
        // ayarlayabiliyoruz. Ancak burada dinamik bir yapi yerine statik bir yapi seciyoruz ve panellerin yeniden
        // boyutlandirilmasini engellemek icin ortadaki ayraci kaldiriyoruz.
        this.setEnabled(false);
        this.setDividerSize(0);
        this.setOrientation(1);

        // Sol panele gelecek olan envanter paneli.
        app_inventory_pane inventory_pane = app_inventory_pane.create_inventory_pane();

        // Sag panele gelecek olan cizim paneli.
        app_canvas_pane canvas_pane = app_canvas_pane.create_canvas_pane();

        // Sol panele envanter panelini ekliyoruz.
        this.setLeftComponent(inventory_pane);

        // Sag panele cizim panelini ekliyoruz.
        this.setRightComponent(canvas_pane);

        // Ortada cikacak olan ayracin konumu. 300 WIDTH.
        // Yani sol panel 300 WIDTH uzunlugunda. Sag panel ise 600 WIDTH uzunlugunda olacktir.
        this.setDividerLocation(300);


    }

    /*
    public static void print(weapon w) {
        // testing
        int[] deagle_mcap = {0, 1};
        weapon_pistol deagle = new weapon_pistol("pistol", "deagle", deagle_mcap, 250, 50, 1, 3, 0);
        System.out.println("category: " + w.getCategory() + "\nname: " + w.getName() + "\nammo: " + w.getMagazine_capacity()[0] + "/" + w.getMagazine_capacity()[1] + "\ndamage: " + w.getDamage() + "\nrange: " + w.getRange_of_fire() + "\nwas: " + w.getWait_after_shot() + "\nreloaded time: " + w.getReload_time() + "\nfire mode: " + w.getFire_mode());
    }

     */
}
