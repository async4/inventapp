package com.inventory.app_common.window_canvas.weapon_properties_pane;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class weapon_properties extends JPanel {
    private static final Dimension properties_pane_size = new Dimension(500, 100);
    private static final Color properties_pane_color = new Color(33, 33, 33);

    private static JLabel magazine_capacity_label = new JLabel();
    private static JLabel damage_label = new JLabel();
    private static JLabel range_of_fire_label = new JLabel();
    private static JLabel reload_time_label = new JLabel();
    private static JLabel fire_mode_label = new JLabel();

    private static Dimension label_size = new Dimension(80, 50);
    private static final Color label_color = new Color(255, 255, 255);

    private static final String icons_path = "/img/icons/";

    private ArrayList<JLabel> labels = new ArrayList<>();

    public weapon_properties() {
        this.setPreferredSize(properties_pane_size);
        this.setBackground(properties_pane_color);

        // Labellarin degerlerleri eklenir.
        labels.add(add_label("magazine_capacity.png", magazine_capacity_label));
        labels.add(add_label("damage.png", damage_label));
        labels.add(add_label("range.png", range_of_fire_label));
        labels.add(add_label("reload_time.png", reload_time_label));
        labels.add(add_label("fire_mode.png", fire_mode_label));

        // Labellar panele eklenir.
        for (var label: labels
             ) {
            this.add(label);
        }
    }

    private JLabel add_label(String icon_file, JLabel label) {
        // Label in boyutu
        label.setPreferredSize(label_size);

        // Label in iconu
        label.setIcon(new ImageIcon(this.getClass().getResource(icons_path + icon_file)));

        // Label in rengi
        label.setForeground(label_color);

        return label;

    }

    public static JLabel getMagazine_capacity_label() {
        return magazine_capacity_label;
    }

    public static JLabel getDamage_label() {
        return damage_label;
    }

    public static JLabel getRange_of_fire() {
        return range_of_fire_label;
    }

    public static JLabel getReload_time() {
        return reload_time_label;
    }

    public static JLabel getFire_mode() {
        return fire_mode_label;
    }

}
