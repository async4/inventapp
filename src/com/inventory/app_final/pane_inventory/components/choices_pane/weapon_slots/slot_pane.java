package com.inventory.app_final.pane_inventory.components.choices_pane.weapon_slots;

import com.inventory.app_final.pane_inventory.components.choices_pane.weapon_slots.selected_pane.selected_pane;
import com.inventory.app_final.pane_inventory.components.choices_pane.start_button.start_button;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class slot_pane extends JPanel {

    public static ArrayList<selected_pane> slots = new ArrayList<>();

    public slot_pane() {
        this.setBackground(new Color(33, 33, 33));


        for (int i = 0; i < 3; i++) {
            slots.add(new selected_pane());
            this.add(slots.get(i));
        }

        this.add(new start_button());
    }

}