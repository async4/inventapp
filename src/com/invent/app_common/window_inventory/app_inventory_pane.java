package com.invent.app_common.window_inventory;

import com.invent.app_common.window_inventory.weapons_menu.weapons_menu;
import com.invent.app_common.window_inventory.weapons_menu.weapons_menu_bar;

import javax.swing.*;
import java.awt.*;


public class app_inventory_pane extends JPanel {
    private static app_inventory_pane inventory_pane;
    private final Color inventory_pane_background_color = new Color(30, 29, 34);

    public app_inventory_pane(){
        this.setBackground(inventory_pane_background_color);
        this.add(new JLabel("PICK WEAPONS TAB"));
        // this.setLayout(new BorderLayout());

        weapons_menu_bar menu_bar = weapons_menu_bar.create_weapons_menu_bar();
        weapons_menu menu = weapons_menu.create_weapons_menu();

        menu_bar.add(menu);
        this.add(menu_bar);

    }

    public static app_inventory_pane create_inventory_pane() {
        if (inventory_pane == null) {
            inventory_pane = new app_inventory_pane();
        }
        return inventory_pane;
    }

    public static app_inventory_pane get_canvas_pane() {
        return inventory_pane;
    }

    public void update_canvas_pane() {
        this.validate();
        this.repaint();
    }
}
