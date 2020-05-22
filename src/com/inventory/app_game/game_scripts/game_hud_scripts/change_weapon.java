package com.inventory.app_game.game_scripts.game_hud_scripts;

import com.inventory.app_game.game_data.game_data;
import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;
import com.inventory.app_game.game_final.game_hud.game_hud;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class change_weapon extends KeyAdapter {

    private game_hud hud;

    public change_weapon(game_hud hud) {
        this.hud = hud;
    }


    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_1) {
            operator.current_weapon = operator.weapons.get(0);
        }

        if (e.getKeyCode() == KeyEvent.VK_2) {
            operator.current_weapon = operator.weapons.get(1);

        }

        if (e.getKeyCode() == KeyEvent.VK_3) {
            operator.current_weapon = operator.weapons.get(2);

        }
    }
}
