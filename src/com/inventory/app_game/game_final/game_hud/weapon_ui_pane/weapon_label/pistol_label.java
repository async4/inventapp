package com.inventory.app_game.game_final.game_hud.weapon_ui_pane.weapon_label;

import com.inventory.app_game.game_data.game_data;

import javax.swing.*;

public class pistol_label extends weapon_label {
    public pistol_label() {
        super();
        this.setText("1 ");
        this.setIcon(new ImageIcon(this.getClass().getResource(game_data.get_game_data().get_pistol_data().getWeapon_default_ico())));
    }
}
