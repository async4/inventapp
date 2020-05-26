package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_scripts.controller;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;
import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_scripts.scripts.operator_action;
import com.inventory.app_game.game_scripts.game_final_scripts.other_scripts.bullet_scripts.bullet_action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class controller_fire extends MouseAdapter {
    private game_handler handler;
    private game_object operator_object;

    public controller_fire(game_handler handler) {
        this.handler = handler;
    }

    private game_object find_operator() {
        game_object operator_object = null;

        for (var object: handler.objects
        ) {
            if (object.getTag() == object_tag.operator) {
                operator_object = object;
            }
        }

        return operator_object;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (operator_object != null) {
            if (operator.reloading == false) {
                if (operator.current_weapon.magazine_capacity > 0) {
                    double mouse_x = e.getX();
                    double mouse_y = e.getY();

                    new Thread(() -> {
                        if (operator.waiting == false) {
                            operator_action.fire();
                            bullet_action.bullet_exit(handler, operator_object, mouse_x, mouse_y);
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
        } else {
            operator_object = find_operator();
        }
    }
}
