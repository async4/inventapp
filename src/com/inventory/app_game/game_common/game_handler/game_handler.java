package com.inventory.app_game.game_common.game_handler;

import com.inventory.app_game.game_common.game_object.game_object;

import java.awt.*;
import java.util.LinkedList;


public class game_handler {

    public LinkedList<game_object> objects = new LinkedList<game_object>();


    // Tum objelerin update metodu calistirilir.
    public void update() {
        for (int i = 0; i < objects.size(); i++) {
            game_object temp = objects.get(i);
            temp.update();
        }
    }

    // Tum objelerin render metodu calistirilir.
    public void render(Graphics g) {
        for (int i = 0; i < objects.size(); i++) {
            game_object temp = objects.get(i);
            temp.render(g);
        }
    }

    // Yeni bir obje ekler.
    public game_object add_object(game_object object) {
        this.objects.add(object);
        return object;
    }


    // Objeyi cikarir.
    public void remove_object(game_object object) {
        this.objects.remove(object);
    }

}