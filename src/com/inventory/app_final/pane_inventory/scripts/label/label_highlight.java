package com.inventory.app_final.pane_inventory.scripts.label;

import com.inventory.app_final.pane_inventory.components.weapon_label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class label_highlight extends MouseAdapter {

    private weapon_label label;


    public label_highlight(weapon_label label) {
        this.label = label;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        label.choice_weapon();
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        if (!label.weapon_data.getWeapon_choice_status()) {
            // weapon label in in uzerine gelindiginde weapon a ait olan icon text yerine eklenir.
            label.change_label_ico("", label.weapon_data.getWeapon_default_ico());
        }

        // weapon in ozellikleri panele eklenir.
        label.add_weapon_properties_to_pane();

        // User paneli gizlenir.
        label.change_user_pane_visible_status(false);

        // weapon properties paneli ekranda gozukur.
        label.change_prop_pane_visible_status(true);
    }


    @Override
    public void mouseExited(MouseEvent e) {
        label.change_label_ico(label.weapon_data.getName(), "");

        // Properties paneli gizlenir.
        label.change_prop_pane_visible_status(false);

        // User paneli gosterilir.
        label.change_user_pane_visible_status(true);
    }

}