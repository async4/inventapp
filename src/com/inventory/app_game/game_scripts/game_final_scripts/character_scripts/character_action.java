package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class character_action extends MouseAdapter {
    private game_handler handler;

    public character_action(game_handler handler) {
        this.handler = handler;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (var object:handler.objects
        ) {
            game_object temp_object = object;

            if (temp_object.getTag() == object_tag.operator) {
                try {
                    System.out.println("fire");
                } catch (ArithmeticException err) {
                    System.out.println(err.getMessage());
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
    }
}
