package com.invent.app_common.window_inventory.weapons_menu.pistols_menu;

import com.invent.app_common.window_inventory.weapons_menu.weapon_menu_pane;

import javax.swing.*;


public class pistol_menu_pane extends weapon_menu_pane {
    private static pistol_menu_pane _pistol_menu_pane;
    public pistol_menu_pane() {
        super();

        this.panel_title = new JLabel("Pistols");
        panel_title.setForeground(this.panel_title_fore_ground_color);
        this.add(panel_title);
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

    public void test() {
        System.out.println("pistol");
    }

}
