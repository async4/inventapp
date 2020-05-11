package com.invent.app_common.window_inventory.weapons_menu;

import com.invent.app_common.window_canvas.user_pane.user_pane;
import com.invent.app_common.window_canvas.weapon_properties_pane.weapon_image;
import com.invent.app_common.window_canvas.weapon_properties_pane.weapon_properties;
import com.invent.app_common.window_canvas.weapon_properties_pane.weapon_properties_pane;
import com.invent.app_components.app_weapons.weapon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class weapon_label extends JLabel implements MouseListener {
    private static weapon_label  _weapon_label;
    private  weapon weapon_data;


    public weapon_label(weapon weapon_data) {
        this.weapon_data = weapon_data;

        this.setText(this.weapon_data.getName());
        this.addMouseListener(this);
    }

    public static void create_weapon_label(weapon weapon_data) {
        _weapon_label = new weapon_label(weapon_data);

    }

    public static weapon_label get_weapon_label() {
        return _weapon_label;
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        this.setForeground(new Color(237, 52, 66));
        weapon_properties.getMagazine_capacity_label().setText(String.valueOf(weapon_data.getMagazine_capacity()[0]) + "/" + String.valueOf(weapon_data.getMagazine_capacity()[1]));
        weapon_properties.getDamage_label().setText(String.valueOf(weapon_data.getDamage()));
        weapon_properties.getRange_of_fire().setText(String.valueOf(weapon_data.getRange_of_fire()));
        weapon_properties.getReload_time().setText(String.valueOf(weapon_data.getReload_time()) + " sec");

        if (String.valueOf(weapon_data.getFire_mode()).compareTo("0") == 0) {
            weapon_properties.getFire_mode().setText("s-auto");
        } else {
            weapon_properties.getFire_mode().setText("auto");
        }

        weapon_properties_pane.get_show_weapon_pane().setVisible(true);

        weapon_image.get_weapon_image_label().setIcon(new ImageIcon(this.getClass().getResource(weapon_data.getWeapon_default_image())));
        weapon_image.get_weapon_name_label().setText(weapon_data.getName());
        user_pane.get_show_user_pane().setVisible(false);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setForeground(new Color(255, 255, 255));

        weapon_properties_pane.get_show_weapon_pane().setVisible(false);
        user_pane.get_show_user_pane().setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
