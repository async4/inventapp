package com.invent.app_common.window_inventory;

import com.invent.app_common.window_inventory.weapons_menu.pistols_menu.pistol_menu_pane;
import com.invent.app_common.window_inventory.weapons_menu.rifles_menu.rifle_menu_pane;
import com.invent.app_common.window_inventory.weapons_menu.smgs_menu.smg_menu_pane;

import javax.swing.*;
import java.awt.*;

public class app_inventory_pane extends JPanel {
    private static app_inventory_pane inventory_pane;
    private final Color inventory_pane_background_color = new Color(26, 26, 26);

    public app_inventory_pane(){
        this.setBackground(inventory_pane_background_color);
        this.add(new JLabel("PICK WEAPONS TAB"));
        this.add(pistol_menu_pane.create_pistol_menu());
        this.add(smg_menu_pane.create_smg_menu_pane());
        this.add(rifle_menu_pane.create_rifle_menu_pane());
    }

    // Panel nesnesinin tekrardan uretilmesini engellemek icin ve nesneye rahatca ulasmak icin.
    public static app_inventory_pane create_inventory_pane() {
        if (inventory_pane == null) {
            inventory_pane = new app_inventory_pane();
        }
        return inventory_pane;
    }

    public static app_inventory_pane get_canvas_pane() {
        return inventory_pane;
    }

    public void update_canvas_pane() {
        this.validate();
        this.repaint();
    }
}
