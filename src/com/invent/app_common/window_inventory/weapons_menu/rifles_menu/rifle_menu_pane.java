package com.invent.app_common.window_inventory.weapons_menu.rifles_menu;

import com.invent.app_dal.get_weapon_data.weapon_data;
import com.invent.app_common.window_inventory.weapons_menu.weapon_menu_pane;
import com.invent.app_components.app_weapons.weapon;

import javax.swing.*;
import java.util.ArrayList;


public class rifle_menu_pane extends weapon_menu_pane {
    private static rifle_menu_pane _rifle_menu_pane;
    public rifle_menu_pane() {
        super();
        this.panel_title = new JLabel("Rifles");
        panel_title.setForeground(this.panel_title_fore_ground_color);
        this.add(panel_title);

        this.get_weapon_data();
    }

    public static rifle_menu_pane create_rifle_menu_pane() {
        if (_rifle_menu_pane == null) {
            _rifle_menu_pane = new rifle_menu_pane();
        }
        return _rifle_menu_pane;
    }

    public static rifle_menu_pane get_rifle_menu_pane() {
        return _rifle_menu_pane;
    }

    @Override
    public void get_weapon_data() {
        ArrayList<weapon> rifles = weapon_data.getRifles_data();
        set_weapon_data(rifles);
    }

}

