package com.invent.app_common.window_inventory.weapons_menu.pistols_menu;

import com.invent.app_dal.get_weapon_data.weapon_data;
import com.invent.app_common.window_inventory.weapons_menu.weapon_menu_pane;
import com.invent.app_components.app_weapons.weapon;

import javax.swing.*;
import java.util.ArrayList;


public class pistol_menu_pane extends weapon_menu_pane {
    private static pistol_menu_pane _pistol_menu_pane;
    public pistol_menu_pane() {
        super();

        this.panel_title = new JLabel("Pistols", SwingConstants.CENTER);
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

    @Override
    public void get_weapon_data() {
        // menulerein icerisine farkli bir panel eklenir daha sonra o panele label lar yerlestirilir.
        // yeni bir panel sinifi olustur. labellari oraya eklemek icin farkli bir fonksiyon olustur.
        ArrayList<weapon> pistols = weapon_data.getPistols_data();
        set_weapon_data(pistols);
    }

}
