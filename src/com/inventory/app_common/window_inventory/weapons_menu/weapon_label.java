package com.inventory.app_common.window_inventory.weapons_menu;

import com.inventory.app_common.window_canvas.user_pane.user_pane;
import com.inventory.app_common.window_canvas.weapon_properties_pane.weapon_image;
import com.inventory.app_common.window_canvas.weapon_properties_pane.weapon_properties;
import com.inventory.app_common.window_canvas.weapon_properties_pane.weapon_properties_pane;
import com.inventory.app_components.app_weapons.weapon;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class weapon_label extends JLabel implements MouseListener {
    private static weapon_label _weapon_label;

    private weapon weapon_data;
    private pick_weapon_pane pick_pane;

    public weapon_label(weapon weapon_data, pick_weapon_pane pick_pane) {
        this.weapon_data = weapon_data;
        this.pick_pane = pick_pane;

        // Uzerine gelinen label a weapon in ismi eklenir.
        this.setText(this.weapon_data.getName());
        this.addMouseListener(this);
    }


    public static void create_weapon_label(weapon weapon_data, pick_weapon_pane pick_pane) {
        _weapon_label = new weapon_label(weapon_data, pick_pane);
    }


    public static weapon_label get_weapon_label() {
        return _weapon_label;
    }


    private void change_label_ico(String text, String ico_path) {
        if (weapon_data.getWeapon_choice_status() == false) {
            this.setText(text);
            this.setIcon(new ImageIcon(this.getClass().getResource(ico_path)));
        }
    }


    // weapon properties ekraninda uzerine gelinen weapon label in ozellikleri eklenir.
    private void add_weapon_properties_to_pane() {
        weapon_properties.getMagazine_capacity_label()
                .setText(
                        weapon_data.getMagazine_capacity()[0] + "/" +
                                weapon_data.getMagazine_capacity()[1]
                );

        // weapon in damage verisi eklenir.
        weapon_properties.getDamage_label().setText(String.valueOf(weapon_data.getDamage()));

        // weapon in range of fire verisi eklenir.
        weapon_properties.getRange_of_fire().setText(String.valueOf(weapon_data.getRange_of_fire()));

        // weapon in reload time verisi eklenir.
        weapon_properties.getReload_time().setText(weapon_data.getReload_time() + " sec");

        // weapon in fire mode verisi eklenir.
        if (weapon_data.getFire_mode() == 0) {
            // 0 ise yari otamatik
            weapon_properties.getFire_mode().setText("s-auto");
        } else {
            // 0 dan farkli ise otomatik
            weapon_properties.getFire_mode().setText("auto");
        }

        // Uzerine gelinen weapon in resmi ekranda gosterilir.
        weapon_image.get_weapon_image_label()
                .setIcon(new ImageIcon(this.getClass().getResource(weapon_data.getWeapon_default_image())));

        // Uzerine gelinen weapon in ismi ekranda gosterilir.
        weapon_image.get_weapon_name_label().setText(weapon_data.getName());
    }


    private void change_user_pane_visible_status(boolean status) {
        user_pane.get_user_pane().setVisible(status);
    }


    private void change_prop_pane_visible_status(boolean status) {
        weapon_properties_pane.get_weapon_prop_pane().setVisible(status);
    }


    private void remove_before_label(weapon before_weapon_data, weapon_label before_label) {
        if (before_weapon_data != null && before_weapon_data.getWeapon_choice_status()) {
            before_weapon_data.setWeapon_choice_status(false);
            before_label.setIcon(new ImageIcon(before_label.getClass().getResource("")));
            before_label.setText(before_weapon_data.getName());
        }
    }


    private void choice_weapon() {
        weapon before_weapon_data = pick_pane.getBefore_weapon_data();
        weapon_label before_label = pick_pane.getBefore_label();

        if (weapon_data.getWeapon_choice_status() && before_weapon_data.getWeapon_choice_status()) {
            weapon_data.setWeapon_choice_status(false);
        } else {
            change_label_ico("", weapon_data.getWeapon_hoverable_ico());
            remove_before_label(before_weapon_data, before_label);

            weapon_data.setWeapon_choice_status(true);

            pick_pane.setBefore_weapon_data(weapon_data);
            pick_pane.setBefore_label(this);
        }
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        if (!weapon_data.getWeapon_choice_status()) {
            // weapon label in in uzerine gelindiginde weapon a ait olan icon text yerine eklenir.
            change_label_ico("", weapon_data.getWeapon_default_ico());
        }

        // weapon in ozellikleri panele eklenir.
        add_weapon_properties_to_pane();

        // User paneli gizlenir.
        change_user_pane_visible_status(false);

        // weapon properties paneli ekranda gozukur.
        change_prop_pane_visible_status(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        choice_weapon();
    }


    @Override
    public void mouseExited(MouseEvent e) {
        change_label_ico(weapon_data.getName(), "");

        // Properties paneli gizlenir.
        change_prop_pane_visible_status(false);

        // User paneli gosterilir.
        change_user_pane_visible_status(true);
    }


    @Override
    public void mousePressed(MouseEvent e) {
    }


    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
