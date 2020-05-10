package com.invent.app_common;

import com.invent.app_common.window_canvas.app_canvas_pane;
import com.invent.app_common.window_inventory.app_inventory_pane;
import com.invent.app_components.app_weapons.weapon;
import com.invent.app_components.app_weapons.weapon_pistols.weapon_pistol;

import javax.swing.*;
import java.awt.*;

public class app_content_pane extends JSplitPane {
    public app_content_pane() {
        this.setBorder(BorderFactory.createLineBorder(new Color(30, 29, 34), 1, false));
        this.setBackground(new Color(23, 21, 26));
        this.setEnabled(false);
        this.setDividerSize(0);
        this.setOrientation(1);

        app_inventory_pane inventory_pane = app_inventory_pane.create_inventory_pane();
        app_canvas_pane canvas_pane = app_canvas_pane.create_canvas_pane();

        this.setLeftComponent(inventory_pane);
        this.setRightComponent(canvas_pane);
        this.setDividerLocation(300);

        // testing
        int[] deagle_mcap = {0, 1};
        weapon_pistol deagle = new weapon_pistol("pistol", "deagle", deagle_mcap, 250, 50, 1, 3, 0);
        print(deagle);
    }

    public static void print(weapon w) {
        System.out.println("category: " + w.getCategory() + "\nname: " + w.getName() + "\nammo: " + w.getMagazine_capacity()[0] + "/" + w.getMagazine_capacity()[1] + "\ndamage: " + w.getDamage() + "\nrange: " + w.getRange_of_fire() + "\nwas: " + w.getWait_after_shot() + "\nreloaded time: " + w.getReload_time() + "\nfire mode: " + w.getFire_mode());
    }
}
