package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_action.controller;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_data.game_data;
import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_action.scripts.fire;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_action.scripts.reload;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class operator_action_fire extends MouseAdapter {
    private game_handler g_handler;

    public operator_action_fire(game_handler g_handler) {
        this.g_handler = g_handler;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (operator.reloading == false) {
            if (operator.current_weapon.magazine_capacity > 0) {
                new Thread(() -> {
                    if (operator.waiting == false) {
                        fire.fired();
                        try {
                            Thread.sleep(operator.current_weapon.wait_after_shot * 1000);
                            operator.waiting = false;
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }).start();
            }
        }
    }
}
