package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_scripts.controller;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class controller_movement extends MouseAdapter {

    private game_handler handler;


    public controller_movement(game_handler handler) {
        this.handler = handler;
    }


    @Override
    public void mouseMoved(MouseEvent e) {
        for (var object:handler.objects
             ) {
            game_object temp_object = object;

            if (temp_object.getTag() == object_tag.operator) {
                try {
                    object.setMouse_x(e.getX());
                    object.setMouse_y(e.getY());
                } catch (ArithmeticException err) {
                    System.out.println(err.getMessage());
                }
            }
        }
    }


}
