package com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots.selected_pane;

import com.inventory.app_common.weapon;

import javax.swing.*;
import java.awt.*;

public abstract class selected_pane extends JPanel {

    /*
    private static selected_weapon_label label;
    private static weapon selected_weapon_data;

     */

    public selected_pane() {
        this.setPreferredSize(new Dimension(250, 145));
        this.setBackground(new Color(26, 26, 26));
        this.setBorder(BorderFactory.createLineBorder(new Color(53, 53, 53)));

        /*
        selected_weapon_label.create_selected_weapon_label();

        label = selected_weapon_label.get_selected_weapon_label();

        this.add(label);

         */
    }

    /*

    public void set_label(String weapon_name, weapon weapon_data) {
        label.setText(weapon_name);
        selected_weapon_data = weapon_data;
    }

    public weapon get_selected_weapon_data() {
        return selected_weapon_data;
    }

     */
}
