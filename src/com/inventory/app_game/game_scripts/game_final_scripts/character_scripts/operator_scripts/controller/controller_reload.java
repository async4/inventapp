package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_scripts.controller;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_scripts.scripts.operator_action;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class controller_reload extends KeyAdapter {

    public controller_reload(game_handler handler) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_R) {
            if (
                operator.current_weapon.total_magazine_capacity > 0 &&
                operator.current_weapon.magazine_capacity  == 0 //< operator.current_weapon.save_magazine_capacity
            ) {
                operator.reloading = true;
                new Thread(() -> {
                    try {
                        Thread.sleep(operator.current_weapon.reload_time * 1000);
                        operator_action.reload();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        }
    }
}
