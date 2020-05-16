package com.inventory.app_common.window_inventory.weapons_menu;

import com.inventory.app_components.app_weapons.weapon;

import javax.swing.*;
import java.awt.*;


public class pick_weapon_pane extends JPanel {
    private final Dimension PANE_SIZE = new Dimension(240, 140);
    private final Color PANE_COLOR = new Color(33, 33, 33);

    private weapon before_weapon_data;

    private weapon_label before_label;


    public pick_weapon_pane() {
        this.setPreferredSize(PANE_SIZE);
        this.setBackground(PANE_COLOR);
    }


    public weapon getBefore_weapon_data() {
        return before_weapon_data;
    }


    public void setBefore_weapon_data(weapon weapon_data) {
        before_weapon_data = weapon_data;
    }


    public weapon_label getBefore_label() {
        return before_label;
    }

    public void setBefore_label(weapon_label current_label) {
        this.before_label = current_label;
    }
}
