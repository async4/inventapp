package com.inventory.app_final.pane_weapons.components;

import com.inventory.app_final.pane_weapons.scripts.pane.pane_highlight;
import com.inventory.app_final.pane_weapons.scripts.pane.pick_weapon_pane;
import com.inventory.app_common.weapon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public  class weapon_pane extends JPanel  {

    protected final Color PANEL_TITLE_FORE_COLOR = new Color(185, 185, 185);

    private final Color PANE_COLOR = new Color(33, 33, 33);
    private final Dimension PANE_SIZE = new Dimension(250, 170);

    private static final Color LABEL_FORE_COLOR = new Color(236, 236, 236);


    public weapon_pane(JLabel title, ArrayList<weapon> weapon_data) {
        title.setForeground(this.PANEL_TITLE_FORE_COLOR);
        this.add(title);

        this.add(create_label(weapon_data));

        this.setBackground(PANE_COLOR);
        this.setPreferredSize(PANE_SIZE);

        // pane higlighter with mouse.
        this.addMouseListener(new pane_highlight(this));
    }


    private pick_weapon_pane create_label(ArrayList<weapon> weapon_data) {
        pick_weapon_pane pick_pane = new pick_weapon_pane();
        pick_pane.setLayout(new GridLayout(0, 2));

        for (var item: weapon_data) {
            weapon_label label = new weapon_label(item, pick_pane);
            label.setForeground(LABEL_FORE_COLOR);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            pick_pane.add(label);
        }
        return pick_pane;
    }

}