package com.inventory.app_game.game_content.game_ui;

import com.inventory.app_game.game_content.game_ui.weapon_ui_pane.weapon_ui_pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class game_ui extends JPanel {

    public game_ui() {
        this.setBorder(BorderFactory.createLineBorder(Color.pink, 1));
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        // this.setBackground(Color.black);
        this.add(new weapon_ui_pane());


    }

}
