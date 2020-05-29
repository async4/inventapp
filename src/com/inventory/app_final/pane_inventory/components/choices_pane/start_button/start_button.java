package com.inventory.app_final.pane_inventory.components.choices_pane.start_button;

import com.inventory.app_final.pane_inventory.components.choices_pane.weapon_slots.slot_pane;
import com.inventory.app_game.game_data.game_data;
import com.inventory.app_game.game_window.game_window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class start_button extends JLabel implements MouseListener {

    public start_button() {
        this.setText("Start");
        this.setBackground(new Color(26, 26, 26));
        this.setBorder(BorderFactory.createLineBorder(new Color(53, 53, 53)));
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(150, 40));
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setForeground(new Color(53, 53, 53));
        this.addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // Slotlarda silah verisi null degilse oyun baslatilabilir.
        if (slot_pane.slots.get(0).get_selected_weapon_data() != null && slot_pane.slots.get(1).get_selected_weapon_data() != null && slot_pane.slots.get(2).get_selected_weapon_data() != null) {
            new game_data(slot_pane.slots.get(0).get_selected_weapon_data(), slot_pane.slots.get(1).get_selected_weapon_data(), slot_pane.slots.get(2).get_selected_weapon_data());
            new game_window();
        }
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        this.setForeground(new Color(252, 252, 252));
        this.setBorder(BorderFactory.createLineBorder(new Color(208, 208, 208)));
    }


    @Override
    public void mouseExited(MouseEvent e) {
        this.setForeground(new Color(53, 53, 53));
        this.setBorder(BorderFactory.createLineBorder(new Color(53, 53, 53)));
    }


    @Override
    public void mousePressed(MouseEvent e) {
    }


    @Override
    public void mouseReleased(MouseEvent e) {
    }

}