package com.inventory.app_common.window_inventory.weapons_menu;

import javax.swing.*;
import java.awt.*;


public class pick_weapon_pane extends JPanel {
    private final Dimension PANE_SIZE = new Dimension(240, 140);
    private final Color PANE_COLOR = new Color(33, 33, 33);


    public pick_weapon_pane() {
        this.setPreferredSize(PANE_SIZE);
        this.setBackground(PANE_COLOR);
    }
}
