package com.inventory.app_game.game_final.game_hud.weapon_ui_pane.weapon_label;

import javax.swing.*;
import java.awt.*;

public abstract class weapon_label extends JLabel {

    protected weapon_label() {
        this.setPreferredSize(new Dimension(100, 60));
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        this.setOpaque(true);
    }
}