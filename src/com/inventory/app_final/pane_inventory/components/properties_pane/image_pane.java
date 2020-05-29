package com.inventory.app_final.pane_inventory.components.properties_pane;

import javax.swing.*;
import java.awt.*;


public class image_pane extends JPanel {

    // Pane
    private final Dimension image_pane_size = new Dimension(450, 400);
    private final Color image_pane_color = new Color(33, 33, 33);

    // Image
    private static JLabel weapon_image_label = new JLabel();
    private Dimension image_label_size = new Dimension(380, 350);

    // Text
    private static JLabel weapon_name_label = new JLabel();
    private Dimension weapon_name_label_size = new Dimension(400, 40);
    private Color weapon_name_label_color = new Color(255, 255, 255);
    private Font weapon_name_label_font = new Font(Font.SANS_SERIF, 1, 30);


    public image_pane() {
        this.setPreferredSize(image_pane_size);
        this.setBackground(image_pane_color);

        weapon_image_label.setPreferredSize(image_label_size);

        weapon_name_label.setPreferredSize(weapon_name_label_size);

        // Weapon name label da ortalanir.
        weapon_name_label.setVerticalAlignment(SwingConstants.CENTER);
        weapon_name_label.setHorizontalAlignment(SwingConstants.CENTER);
        weapon_name_label.setForeground(weapon_name_label_color);
        weapon_name_label.setFont(weapon_name_label_font);

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
