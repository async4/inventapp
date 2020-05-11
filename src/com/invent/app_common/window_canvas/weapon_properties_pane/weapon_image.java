package com.invent.app_common.window_canvas.weapon_properties_pane;

import javax.swing.*;
import java.awt.*;

public class weapon_image extends JPanel {
    private static JLabel weapon_image_label = new JLabel();
    private static JLabel weapon_name_label = new JLabel();

    public weapon_image() {
        this.setPreferredSize(new Dimension(450, 400));
        this.setBackground(new Color(33, 33, 33));

        weapon_image_label.setPreferredSize(new Dimension(380, 350));

        weapon_name_label.setPreferredSize(new Dimension(400, 40));
        weapon_name_label.setVerticalAlignment(SwingConstants.CENTER);
        weapon_name_label.setHorizontalAlignment(SwingConstants.CENTER);
        weapon_name_label.setForeground(Color.white);
        weapon_name_label.setFont(new Font(Font.SANS_SERIF, 1, 30));
        this.add(weapon_image_label);
        this.add(weapon_name_label);
    }

    public static JLabel get_weapon_image_label() {
        return weapon_image_label;
    }

    public static JLabel get_weapon_name_label() {
        return weapon_name_label;
    }
}
