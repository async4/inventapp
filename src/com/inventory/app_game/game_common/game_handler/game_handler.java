package com.inventory.app_game.game_common.game_handler;

import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;

import java.awt.*;
import java.util.LinkedList;


public class game_handler {

    public LinkedList<game_object> objects = new LinkedList<game_object>();


    public void update() {
        for (int i = 0; i < objects.size(); i++) {
            game_object temp = objects.get(i);
            temp.update();
        }

        /*

        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i).getTag() == object_tag.bullet) {
                System.out.println("bullet");
            } else {
                System.out.println(" ");
            }
        }


         */
    }


    public void render(Graphics g) {
        for (int i = 0; i < objects.size(); i++) {
            game_object temp = objects.get(i);
            temp.render(g);
        }
    }


    public game_object add_object(game_object object) {
        this.objects.add(object);
        return object;
    }


    public void remove_object(game_object object) {
        this.objects.remove(object);
    }
}