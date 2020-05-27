package com.inventory.app_final.pane_inventory.components;

import com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots.selected_pane.selected_pistol_pane;
import com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots.selected_pane.selected_rifle_pane;
import com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots.selected_pane.selected_smg_pane;
import com.inventory.app_final.pane_canvas.components.choices_pane.choices_pane;
import com.inventory.app_final.pane_canvas.components.choices_pane.weapon_slots.slot_pane;
import com.inventory.app_final.pane_canvas.components.properties_pane.image;
import com.inventory.app_final.pane_canvas.components.properties_pane.properties;
import com.inventory.app_final.pane_canvas.components.properties_pane.content_pane;
import com.inventory.app_final.pane_inventory.scripts.pane.pick_weapon_pane;
import com.inventory.app_final.pane_inventory.scripts.label.label_highlight;
import com.inventory.app_common.weapon;

import javax.swing.*;


public class weapon_label extends JLabel {

    public weapon weapon_data;
    private pick_weapon_pane pick_pane;


    public weapon_label(weapon weapon_data, pick_weapon_pane pick_pane) {
        this.weapon_data = weapon_data;
        this.pick_pane = pick_pane;

        // Uzerine gelinen label a weapon in ismi eklenir.
        this.setText(this.weapon_data.getName());
        this.addMouseListener(new label_highlight(this));
    }


    public void change_label_ico(String text, String ico_path) {
        if (weapon_data.getWeapon_choice_status() == false) {
            this.setText(text);
            this.setIcon(new ImageIcon(this.getClass().getResource(ico_path)));
        }
    }


    // weapon properties ekraninda uzerine gelinen weapon label in ozellikleri eklenir.
    public void add_weapon_properties_to_pane() {
        properties.getMagazine_capacity_label()
                .setText(
                        weapon_data.getMagazine_capacity()[0] + "/" +
                        weapon_data.getMagazine_capacity()[1]
                );

        // weapon in damage verisi eklenir.
        properties.getDamage_label().setText(String.valueOf(weapon_data.getDamage()));

        // weapon in range of fire verisi eklenir.
        properties.getRange_of_fire().setText(String.valueOf(weapon_data.getRange_of_fire()));

        // weapon in reload time verisi eklenir.
        properties.getReload_time().setText(weapon_data.getReload_time() + " sec");

        // weapon in fire mode verisi eklenir.
        if (weapon_data.getFire_mode() == 0) {
            // 0 ise yari otamatik
            properties.getFire_mode().setText("s-auto");
        } else {
            // 0 dan farkli ise otomatik
            properties.getFire_mode().setText("auto");
        }

        // Uzerine gelinen weapon in resmi ekranda gosterilir.
        image.get_weapon_image_label()
                .setIcon(new ImageIcon(this.getClass().getResource(weapon_data.getWeapon_default_image())));

        // Uzerine gelinen weapon in ismi ekranda gosterilir.
        image.get_weapon_name_label().setText(weapon_data.getName());
    }


    public void change_user_pane_visible_status(boolean status) {
        choices_pane.get_choices_pane().setVisible(status);
    }


    public void change_prop_pane_visible_status(boolean status) {
        content_pane.get_content_pane().setVisible(status);
    }


    public void remove_before_label(weapon before_weapon_data, weapon_label before_label) {
        if (before_weapon_data != null && before_weapon_data.getWeapon_choice_status()) {
            before_weapon_data.setWeapon_choice_status(false);
            before_label.setIcon(new ImageIcon(before_label.getClass().getResource("")));
            before_label.setText(before_weapon_data.getName());
        }
    }


    public void choice_weapon() {
        weapon before_weapon_data = pick_pane.getBefore_weapon_data();
        weapon_label before_label = pick_pane.getBefore_label();

        if (weapon_data.getWeapon_choice_status() && before_weapon_data.getWeapon_choice_status()) {
            weapon_data.setWeapon_choice_status(false);

            /* ///////////////////////////////////////////////// OPTIMIZE EDILECEK */
            if (weapon_data.getCategory().compareTo("pistol") == 0) {
                selected_pistol_pane.setPistol_label("empty slot", null);
            }
            if (weapon_data.getCategory().compareTo("smg") == 0) {
                selected_smg_pane.setSmg_label("empty slot", null);
            }
            if (weapon_data.getCategory().compareTo("rifle") == 0) {
                selected_rifle_pane.setRifle_label("empty slot", null);
            }
            /* ///////////////////////////////////////////////// OPTIMIZE EDILECEK */

        } else {
            change_label_ico("", weapon_data.getWeapon_hoverable_ico());
            remove_before_label(before_weapon_data, before_label);

            weapon_data.setWeapon_choice_status(true);

            /* ///////////////////////////////////////////////// OPTIMIZE EDILECEK */
            if (weapon_data.getCategory().compareTo("pistol") == 0) {
                selected_pistol_pane.setPistol_label(weapon_data.getName(), weapon_data);
            }
            if (weapon_data.getCategory().compareTo("smg") == 0) {
                selected_smg_pane.setSmg_label(weapon_data.getName(), weapon_data);
            }
            if (weapon_data.getCategory().compareTo("rifle") == 0) {
                selected_rifle_pane.setRifle_label(weapon_data.getName(), weapon_data);
            }
            /* ///////////////////////////////////////////////// OPTIMIZE EDILECEK */

            pick_pane.setBefore_weapon_data(weapon_data);
            pick_pane.setBefore_label(this);
        }
    }


}