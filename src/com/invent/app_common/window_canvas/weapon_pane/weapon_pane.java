package com.invent.app_common.window_canvas.weapon_pane;

import javax.swing.*;
import java.awt.*;

public class weapon_pane extends JPanel {
    private static weapon_pane _weapon_pane;

    public weapon_pane() {
        this.add(new JLabel("PROPERTIES"));
        this.setBackground(new Color(33, 33, 33));
        this.setVisible(false);
        this.setPreferredSize(new Dimension(550, 520));
    }

    public static weapon_pane create_weapon_pane() {
        if (_weapon_pane == null) {
            _weapon_pane = new weapon_pane();
        }
        return _weapon_pane;
    }

    public static weapon_pane get_show_weapon_pane() {
        return _weapon_pane;
    }

}
