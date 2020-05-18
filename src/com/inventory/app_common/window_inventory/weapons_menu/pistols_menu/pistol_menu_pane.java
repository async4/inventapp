package com.inventory.app_common.window_inventory.weapons_menu.pistols_menu;

import com.inventory.app_dal.weapon_properties_data;
import com.inventory.app_common.window_inventory.weapons_menu.weapon_menu_pane;
import com.inventory.app_components.app_weapons.weapon;

import javax.swing.*;
import java.util.ArrayList;


public class pistol_menu_pane extends weapon_menu_pane {
    private static pistol_menu_pane _pistol_menu_pane;


    public pistol_menu_pane() {
        super();

        this.panel_title = new JLabel("Pistols", SwingConstants.CENTER);
        panel_title.setForeground(this.PANEL_TITLE_FORE_COLOR);
        this.add(panel_title);

        this.get_weapon_data();
    }


    public static pistol_menu_pane create_pistol_menu() {
        if (_pistol_menu_pane == null) {
            _pistol_menu_pane = new pistol_menu_pane();
        }
        return _pistol_menu_pane;
    }


    public static pistol_menu_pane get_pistol_menu_pane() {
        return _pistol_menu_pane;
    }


    @Override
    public void get_weapon_data() {
        ArrayList<weapon> pistols = weapon_properties_data.getPistols_data();
        set_weapon_data(pistols);
    }
}