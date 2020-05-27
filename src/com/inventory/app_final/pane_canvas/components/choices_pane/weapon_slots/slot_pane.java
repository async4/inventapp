package com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots;

import com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots.selected_pane.selected_pane;
import com.inventory.app_final.pane_canvas.components.choices_pane.start_button.start_button;
import com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots.selected_pane.selected_pistol_pane;
import com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots.selected_pane.selected_rifle_pane;
import com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots.selected_pane.selected_smg_pane;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class slot_pane extends JPanel {

    public static ArrayList<selected_pane> slots = new ArrayList<>();

    public slot_pane() {
        this.setBackground(new Color(33, 33, 33));

        /*

        for (int i = 0; i < 2; i++) {
            slots.add(new selected_pane());
            this.add(slots.get(i));
        }

         */



        this.add(new selected_pistol_pane());
        this.add(new selected_smg_pane());
        this.add(new selected_rifle_pane());

        this.add(new start_button());
    }

}
