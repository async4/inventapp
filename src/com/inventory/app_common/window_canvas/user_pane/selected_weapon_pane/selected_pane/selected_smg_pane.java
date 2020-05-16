package com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_pane;

import com.inventory.app_components.app_weapons.weapon;

public class selected_smg_pane extends selected_pane {
    private static selected_weapon_label smg_label;
    private static weapon selected_weapon_data;

    public selected_smg_pane() {
        super();

        selected_weapon_label.create_selected_weapon_label();

        smg_label = selected_weapon_label.get_selected_weapon_label();
        this.add(smg_label);
    }

    public static void setSmg_label(String weapon_name, weapon weapon_data) {
        smg_label.setText(weapon_name);
        selected_weapon_data = weapon_data;
    }

    public static weapon getSelected_weapon_data() {
        return selected_weapon_data;
    }
}
