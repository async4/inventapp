package com.inventory.app_final.pane_inventory;

import com.inventory.app_final.pane_inventory.components.choices_pane.choices_pane;
import com.inventory.app_final.pane_inventory.components.properties_pane.prop_content_pane;

import javax.swing.*;
import java.awt.*;


public class inventory extends JPanel {

    // Panel arkaplan rengi.
    private final Color inventory_pane_background_color = new Color(26, 26, 26);


    public inventory() {
        this.setBackground(inventory_pane_background_color);
        JLabel title = new JLabel("INVENTORY AND WEAPON PROPERTIES");
        title.setForeground(new Color(166, 166, 166));
        this.add(title);
        this.add(choices_pane.create_choices_pane());
        this.add(prop_content_pane.create_prop_content_pane());
    }

}
