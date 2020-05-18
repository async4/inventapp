package com.inventory.app_game.game_content.game_ui.weapon_ui_pane.weapon_label;

import com.inventory.app_game.game_data.game_data;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class pistol_label extends weapon_label {
    public pistol_label() {
        super();
        this.setText("1 ");
        this.setIcon(new ImageIcon(this.getClass().getResource(game_data.get_game_data().get_pistol_data().getWeapon_default_ico())));
    }
}
