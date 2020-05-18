package com.inventory.app_game.game_content.game_ui.weapon_ui_pane.weapon_label;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class weapon_label extends JLabel {

    protected weapon_label() {
        this.setPreferredSize(new Dimension(100, 60));
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        this.setOpaque(true);
    }
}