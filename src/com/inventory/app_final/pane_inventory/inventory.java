package com.inventory.app_final.pane_inventory;

import com.inventory.app_final.pane_inventory.components.weapon_pane;
import com.inventory.app_common.weapon;
import com.inventory.app_dal.weapon_properties_data;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class inventory extends JPanel {

    private final Color PANE_COLOR = new Color(26, 26, 26);
    private final Color PANE_FORE_COLOR = new Color(166, 166, 166);
    private final String PANE_TITLE = "WEAPONS";


    public inventory(){
        this.setBackground(PANE_COLOR);

        JLabel title = new JLabel(PANE_TITLE);
        title.setForeground(PANE_FORE_COLOR);

        this.add(title);

        ArrayList<JLabel> test_title = new ArrayList<>();
        test_title.add(new JLabel("Pistols"));
        test_title.add(new JLabel("Smg's"));
        test_title.add(new JLabel("Rifles"));


        ArrayList<ArrayList<weapon>> weapon_data = new ArrayList<>();
        weapon_data.add(weapon_properties_data.getPistols_data());
        weapon_data.add(weapon_properties_data.getSmgs_data());
        weapon_data.add(weapon_properties_data.getRifles_data());

        for (int i = 0; i < 3; i++) {
            this.add(new weapon_pane(test_title.get(i), weapon_data.get(i)));
        }

    }

}
