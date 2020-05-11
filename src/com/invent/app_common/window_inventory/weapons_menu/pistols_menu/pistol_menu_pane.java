package com.invent.app_common.window_inventory.weapons_menu.pistols_menu;

import com.invent.app_business.test;
import com.invent.app_common.window_inventory.weapons_menu.weapon_menu_pane;
import com.invent.app_components.app_weapons.weapon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class pistol_menu_pane extends weapon_menu_pane {
    private static pistol_menu_pane _pistol_menu_pane;
    public pistol_menu_pane() {
        super();

        this.panel_title = new JLabel("Pistols", SwingConstants.CENTER);
        panel_title.setForeground(this.panel_title_fore_ground_color);
        this.add(panel_title);
        test();
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
        // menulerein icerisine farkli bir panel eklenir daha sonra o panele label lar yerlestirilir.
        // yeni bir panel sinifi olustur. labellari oraya eklemek icin farkli bir fonksiyon olustur.
        test.set_pistols();
        ArrayList<weapon> pistols = test.get_pistols();
        JPanel pn = new JPanel();
        pn.setPreferredSize(new Dimension(250, 140));
        pn.setBackground(new Color(0.1f, 0.1f, 0.1f, 0.1f));
        this.add(pn);

        pn.setLayout(new GridLayout(0, 2));
        for (int i = 0; i < pistols.size(); i++) {
            JLabel label = new JLabel(pistols.get(i).getName());
            label.setForeground(Color.white);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            pn.add(label);
        }
    }

}
