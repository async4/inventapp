package com.inventory.app_game.game_common.game_handler;

import com.inventory.app_game.game_common.game_object.game_object;

import java.awt.*;
import java.util.LinkedList;

public class game_handler {
    public LinkedList<game_object> objects = new LinkedList<game_object>();

    public void render(Graphics g) {
        for (var object: objects
             ) {
            game_object temp = object;
            temp.render(g);
        }
    }

    public void add_object(game_object object) {
        this.objects.add(object);
    }

    public void remove_object(game_object object) {
        this.objects.remove(object);
    }
}
