package com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_pane;

import com.inventory.app_components.app_weapons.weapon;
/* OPTIMIZE EDILECEK */
public class selected_rifle_pane extends selected_pane {
    private static selected_weapon_label rifle_label;
    private static weapon selected_weapon_data;

    public selected_rifle_pane() {
        super();

        selected_weapon_label.create_selected_weapon_label();

        rifle_label = selected_weapon_label.get_selected_weapon_label();
        this.add(rifle_label);
    }

    public static void setRifle_label(String weapon_name, weapon weapon_data) {
        rifle_label.setText(weapon_name);
        selected_weapon_data = weapon_data;
    }

    public static weapon getSelected_weapon_data() {
        return selected_weapon_data;
    }
}
