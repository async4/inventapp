package com.invent.app_common.window_inventory.weapons_menu;

import com.invent.app_components.app_weapons.weapon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class weapon_menu_pane extends JPanel implements MouseListener {
    protected JLabel panel_title;
    protected Color panel_title_fore_ground_color = new Color(185, 185, 185);

    public weapon_menu_pane() {
        this.setBackground(new Color(33, 33, 33));
        this.setPreferredSize(new Dimension(250, 170));
        this.addMouseListener(this);
        this.get_weapon_data();
    }

    public void get_weapon_data() {}

    public void set_weapon_data(ArrayList<weapon> weapon_data) {
        pick_weapon_pane pick_pane = new pick_weapon_pane();
        pick_pane.setLayout(new GridLayout(0, 2));

        for (int i = 0; i < weapon_data.size(); i++) {
            System.out.println(weapon_data.get(i));
            weapon_label.create_weapon_label(weapon_data.get(i));
            weapon_label label = weapon_label.get_weapon_label();

            label.setForeground(Color.white);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            pick_pane.add(label);
        }
        this.add(pick_pane);
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        panel_title.setForeground(new Color(255, 255, 255));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBorder(BorderFactory.createLineBorder(Color.white, 0, true));
        panel_title.setForeground(panel_title_fore_ground_color);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
}
