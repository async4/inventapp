package com.inventory.app_common.window_canvas.weapon_properties_pane;

import javax.swing.*;
import java.awt.*;

public class weapon_properties_pane extends JPanel {
    private static weapon_properties_pane _weapon_prop_pane;

    public weapon_properties_pane() {
        this.setBackground(new Color(33, 33, 33));
        this.setPreferredSize(new Dimension(550, 520));
        this.add(new weapon_image());
        this.add(new weapon_properties());

        this.setVisible(false);
    }

    public static weapon_properties_pane create_weapon_pane() {
        if (_weapon_prop_pane == null) {
            _weapon_prop_pane = new weapon_properties_pane();
        }
        return _weapon_prop_pane;
    }

    public static weapon_properties_pane get_weapon_prop_pane() {
        return _weapon_prop_pane;
    }

}
