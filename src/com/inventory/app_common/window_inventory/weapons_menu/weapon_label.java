package com.inventory.app_common.window_inventory.weapons_menu;

import com.inventory.app_common.window_canvas.user_pane.user_pane;
import com.inventory.app_common.window_canvas.weapon_properties_pane.weapon_image;
import com.inventory.app_common.window_canvas.weapon_properties_pane.weapon_properties;
import com.inventory.app_common.window_canvas.weapon_properties_pane.weapon_properties_pane;
import com.inventory.app_components.app_weapons.weapon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class weapon_label extends JLabel implements MouseListener {
    private static weapon_label _weapon_label;

    private weapon weapon_data;

    private static final Color default_label_color = new Color(255, 255, 255);
    private static final Color hoverable_label_color = new Color(237, 52, 66);


    public weapon_label(weapon weapon_data) {
        this.weapon_data = weapon_data;

        // Uzerine gelinen label a weapon in ismi eklenir.
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
        if (weapon_data.getWeapon_choice_status() == false) {
            // Mouse ile label in uzerine gelindiginde label in rengi degisir.
            this.setText("");
            this.setIcon(new ImageIcon(this.getClass().getResource(weapon_data.getWeapon_default_ico())));
        }

        // weapon properties ekranina uzerine gelinen weapon in ozellikleri eklenir.
        weapon_properties.getMagazine_capacity_label().setText(String.valueOf(weapon_data.getMagazine_capacity()[0]) + "/" +
                                                               String.valueOf(weapon_data.getMagazine_capacity()[1]));
        weapon_properties.getDamage_label().setText(String.valueOf(weapon_data.getDamage()));
        weapon_properties.getRange_of_fire().setText(String.valueOf(weapon_data.getRange_of_fire()));
        weapon_properties.getReload_time().setText(String.valueOf(weapon_data.getReload_time()) + " sec");

        if (String.valueOf(weapon_data.getFire_mode()).compareTo("0") == 0) {
            weapon_properties.getFire_mode().setText("s-auto");
        } else {
            weapon_properties.getFire_mode().setText("auto");
        }

        // weapon properties paneli ekranda gozukur.
        weapon_properties_pane.getWeapon_prop_pane().setVisible(true);

        // Uzerine gelinen weapon in resmi ekranda gosterilir.
        weapon_image.get_weapon_image_label().setIcon(new ImageIcon(this.getClass().getResource(weapon_data.getWeapon_default_image())));

        // Uzerine gelinen weapon in ismi ekranda gosterilir.
        weapon_image.get_weapon_name_label().setText(weapon_data.getName());

        // User paneli gizlenir.
        user_pane.get_show_user_pane().setVisible(false);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (weapon_data.getWeapon_choice_status() == false) {
            this.setIcon(new ImageIcon(this.getClass().getResource("")));
            this.setText(weapon_data.getName());
        }

        // Properties paneli gizlenir.
        weapon_properties_pane.getWeapon_prop_pane().setVisible(false);

        // User paneli gosterilir.
        user_pane.get_show_user_pane().setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        weapon_data.setWeapon_choice_status(true);
        this.setIcon(new ImageIcon(this.getClass().getResource(weapon_data.getWeapon_hoverable_ico())));
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
