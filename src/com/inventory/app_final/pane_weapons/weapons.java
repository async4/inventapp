package com.inventory.app_final.pane_weapons;

import com.inventory.app_final.pane_weapons.components.weapon_pane;
import com.inventory.app_common.weapon;
import com.inventory.app_dal.weapon_properties_data;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class weapons extends JPanel {

    private final Color PANE_COLOR = new Color(26, 26, 26);
    private final Color PANE_FORE_COLOR = new Color(166, 166, 166);
    private final String PANE_TITLE = "WEAPONS";


    public weapons(){
        this.setBackground(PANE_COLOR);

        JLabel title = new JLabel(PANE_TITLE);
        title.setForeground(PANE_FORE_COLOR);

        this.add(title);

        // Silah kategori isimleri bir array e aktarilir.
        ArrayList<JLabel> empty_title = new ArrayList<>();
        empty_title.add(new JLabel("Pistols"));
        empty_title.add(new JLabel("Smg's"));
        empty_title.add(new JLabel("Rifles"));

        // Silah verileri bir array e aktarilir.
        ArrayList<ArrayList<weapon>> empty_weapon_data = new ArrayList<>();
        empty_weapon_data.add(weapon_properties_data.getPistols_data());
        empty_weapon_data.add(weapon_properties_data.getSmgs_data());
        empty_weapon_data.add(weapon_properties_data.getRifles_data());

        for (int i = 0; i < 3; i++) {
            // 3 adet silah paneli olusturulur.
            this.add(new weapon_pane(empty_title.get(i), empty_weapon_data.get(i)));
        }

    }

}
