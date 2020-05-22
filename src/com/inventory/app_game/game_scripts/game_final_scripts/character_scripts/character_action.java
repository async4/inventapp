package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class character_action extends MouseAdapter {
    private game_handler g_handler;

    public character_action(game_handler g_handler) {
        this.g_handler = g_handler;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        operator.current_weapon.mag_cap--;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
}
