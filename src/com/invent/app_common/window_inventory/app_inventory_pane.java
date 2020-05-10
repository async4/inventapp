package com.invent.app_common.window_inventory;

import javax.swing.*;
import java.awt.*;


public class app_inventory_pane extends JPanel {
    private static app_inventory_pane inventory_pane;
    private final Color inventory_pane_background_color = new Color(30, 29, 34);

    public app_inventory_pane(){
        this.setBackground(inventory_pane_background_color);
        this.add(new JLabel("PICK WEAPONS TAB"));

        JMenuBar weapons_menu_bar = new JMenuBar();
        JMenu weapons_menu = new JMenu("weapons");
        JMenuItem weapon_pistols_menu = new JMenu("pistols");
        JMenuItem weapon_smgs_menu = new JMenu("smgs");
        JMenuItem weapon_rifles_menu = new JMenu("rifles");
        weapons_menu.add(weapon_pistols_menu);
        weapons_menu.add(weapon_smgs_menu);
        weapons_menu.add(weapon_rifles_menu);
        weapons_menu_bar.add(weapons_menu);
        weapons_menu_bar.add(Box.createRigidArea(new Dimension(0,25)));
        weapons_menu.add(Box.createRigidArea(new Dimension(200,25)));
        weapon_pistols_menu.add(Box.createRigidArea(new Dimension(100,25)));
        weapon_smgs_menu.add(Box.createRigidArea(new Dimension(100,25)));
        weapon_rifles_menu.add(Box.createRigidArea(new Dimension(100,25)));

        this.add(weapons_menu_bar);
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
