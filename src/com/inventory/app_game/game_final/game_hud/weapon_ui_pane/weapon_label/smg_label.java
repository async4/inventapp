package com.inventory.app_game.game_final.game_ui.weapon_ui_pane.weapon_label;

import com.inventory.app_game.game_data.game_data;

import javax.swing.*;

public class smg_label extends weapon_label {
    public smg_label() {
        super();
        this.setText("2 ");
        this.setIcon(new ImageIcon(this.getClass().getResource(game_data.get_game_data().get_smg_data().getWeapon_default_ico())));

    }
}
