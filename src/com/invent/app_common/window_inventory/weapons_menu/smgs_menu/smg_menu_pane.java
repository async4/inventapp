package com.invent.app_common.window_inventory.weapons_menu.smgs_menu;

import com.invent.app_common.window_inventory.weapons_menu.weapon_menu_pane;

import javax.swing.*;


public class smg_menu_pane extends weapon_menu_pane {
    private static smg_menu_pane _smg_menu_pane;

    public smg_menu_pane() {
        super();
        this.panel_title = new JLabel("Smg's");
        panel_title.setForeground(this.panel_title_fore_ground_color);
        this.add(panel_title);
    }

    public static smg_menu_pane create_smg_menu_pane() {
        if (_smg_menu_pane == null) {
            _smg_menu_pane = new smg_menu_pane();
        }
        return _smg_menu_pane;
    }

    public static smg_menu_pane get_smg_menu_pane() {
        return _smg_menu_pane;
    }

    public void test() {
    }

}
