package com.inventory.app_common.window_inventory;

import com.inventory.app_common.window_inventory.weapons_menu.pistols_menu.pistol_menu_pane;
import com.inventory.app_common.window_inventory.weapons_menu.rifles_menu.rifle_menu_pane;
import com.inventory.app_common.window_inventory.weapons_menu.smgs_menu.smg_menu_pane;

import javax.swing.*;
import java.awt.*;


public class app_inventory_pane extends JPanel {

    private final Color PANE_COLOR = new Color(26, 26, 26);
    private final Color PANE_FORE_COLOR = new Color(166, 166, 166);
    private final String PANE_TITLE = "WEAPONS";


    public app_inventory_pane(){
        this.setBackground(PANE_COLOR);

        JLabel title = new JLabel(PANE_TITLE);
        title.setForeground(PANE_FORE_COLOR);

        this.add(title);
        this.add(new pistol_menu_pane());
        this.add(new smg_menu_pane());
        this.add(new rifle_menu_pane());
    }

}
