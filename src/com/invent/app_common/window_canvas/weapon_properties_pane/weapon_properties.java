package com.invent.app_common.window_canvas.weapon_properties_pane;

import javax.swing.*;
import java.awt.*;

public class weapon_properties extends JPanel {
    private static JLabel magazine_capacity_label = new JLabel();
    private static JLabel damage_label = new JLabel();
    private static JLabel range_of_fire = new JLabel();
    private static JLabel reload_time = new JLabel();
    private static JLabel fire_mode = new JLabel();

    private static Dimension label_size = new Dimension(80, 50);

    public weapon_properties() {
        this.setPreferredSize(new Dimension(500, 100));
        this.setBackground(new Color(33, 33, 33));

        magazine_capacity_label.setPreferredSize(label_size);
        magazine_capacity_label.setIcon(new ImageIcon(this.getClass().getResource("/img/icons/magazine_capacity.png")));
        magazine_capacity_label.setForeground(Color.white);

        damage_label.setPreferredSize(label_size);
        damage_label.setIcon(new ImageIcon(this.getClass().getResource("/img/icons/damage.png")));
        damage_label.setForeground(Color.white);

        range_of_fire.setPreferredSize(label_size);
        range_of_fire.setIcon(new ImageIcon(this.getClass().getResource("/img/icons/range.png")));
        range_of_fire.setForeground(Color.white);

        reload_time.setPreferredSize(label_size);
        reload_time.setIcon(new ImageIcon(this.getClass().getResource("/img/icons/reload_time.png")));
        reload_time.setForeground(Color.white);

        fire_mode.setPreferredSize(label_size);
        fire_mode.setIcon(new ImageIcon(this.getClass().getResource("/img/icons/fire_mode.png")));
        fire_mode.setForeground(Color.white);

        this.add(magazine_capacity_label);
        this.add(damage_label);
        this.add(range_of_fire);
        this.add(reload_time);
        this.add(fire_mode);
    }

    public static JLabel getMagazine_capacity_label() {
        return magazine_capacity_label;
    }

    public static JLabel getDamage_label() {
        return damage_label;
    }

    public static JLabel getRange_of_fire() {
        return range_of_fire;
    }

    public static JLabel getReload_time() {
        return reload_time;
    }

    public static JLabel getFire_mode() {
        return fire_mode;
    }

}
