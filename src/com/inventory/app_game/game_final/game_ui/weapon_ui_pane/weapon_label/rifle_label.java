package com.inventory.app_game.game_content.game_ui.weapon_ui_pane.weapon_label;

import com.inventory.app_game.game_data.game_data;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class rifle_label extends weapon_label {
    public rifle_label() {
        super();
        this.setText("3 ");
        this.setIcon(new ImageIcon(this.getClass().getResource(game_data.get_game_data().get_rifle_data().getWeapon_default_ico())));

    }
}
