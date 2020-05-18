package com.inventory.app_common.window_inventory.weapons_menu.smgs_menu;

import com.inventory.app_dal.weapon_properties_data;
import com.inventory.app_common.window_inventory.weapons_menu.weapon_menu_pane;
import com.inventory.app_components.app_weapons.weapon;

import javax.swing.*;
import java.util.ArrayList;


public class smg_menu_pane extends weapon_menu_pane {
    private static smg_menu_pane _smg_menu_pane;

    public smg_menu_pane() {
        super();

        this.panel_title = new JLabel("Smg's");
        panel_title.setForeground(this.PANEL_TITLE_FORE_COLOR);
        this.add(panel_title);

        this.get_weapon_data();
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


    @Override
    public void get_weapon_data() {
        ArrayList<weapon> smgs = weapon_properties_data.getSmgs_data();
        set_weapon_data(smgs);
    }
}