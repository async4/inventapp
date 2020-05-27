package com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_pane;

import javax.swing.*;
import java.awt.*;

public class selected_weapon_label extends JLabel {

    private static selected_weapon_label _selected_weapon_label;

    public selected_weapon_label() {
        this.setPreferredSize(new Dimension(240, 130));
        this.setForeground(new Color(170, 170, 170));
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setText("empty slot");
    }

    public static void create_selected_weapon_label() {
        _selected_weapon_label = new selected_weapon_label();
    }

    public static selected_weapon_label get_selected_weapon_label() {
        return _selected_weapon_label;
    }

}
