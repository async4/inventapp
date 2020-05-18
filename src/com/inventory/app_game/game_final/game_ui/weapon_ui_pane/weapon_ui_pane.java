package com.inventory.app_game.game_final.game_ui.weapon_ui_pane;

import com.inventory.app_game.game_final.game_ui.weapon_ui_pane.weapon_label.pistol_label;
import com.inventory.app_game.game_final.game_ui.weapon_ui_pane.weapon_label.rifle_label;
import com.inventory.app_game.game_final.game_ui.weapon_ui_pane.weapon_label.smg_label;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class weapon_ui_pane extends JPanel implements KeyListener {

    public weapon_ui_pane() {
        this.add(new pistol_label());
        this.add(new smg_label());
        this.add(new rifle_label());

        this.setFocusable(true);
        this.addKeyListener(this);
    }


    @Override
    public void keyPressed(KeyEvent e) {
        // pistol sec
        if (e.getKeyCode() == KeyEvent.VK_1) {

        }

        // smg sec
        if (e.getKeyCode() == KeyEvent.VK_2) {

        }

        // rifle sec
        if (e.getKeyCode() == KeyEvent.VK_3) {

        }

        // reload
        if (e.getKeyCode() == KeyEvent.VK_R) {

        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }


    @Override
    public void keyReleased(KeyEvent e) {
    }
}
