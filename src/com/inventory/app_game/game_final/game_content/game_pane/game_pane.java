package com.inventory.app_game.game_final.game_content.game_pane;

import com.inventory.app_game.game_data.game_data;
import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;

import javax.swing.*;
import java.awt.*;

public class game_pane extends JPanel implements Runnable {
    private static game_pane game_pane;

    private Thread game_thread;

    private boolean game_running_status = false;

    public game_pane() {
        this.setBackground(new Color(53, 53, 53));

        this.add(new operator(game_data.get_game_data()));
    }

    public static game_pane create_game_pane() {
        if (game_pane == null) {
            game_pane = new game_pane();
        }
        return game_pane;
    }


    @Override
    public void run() {
        float fl_previous_time = 0;
        float fl_current_time = System.currentTimeMillis();

        while (game_running_status) {
            fl_previous_time = fl_current_time;
            fl_current_time = System.currentTimeMillis();

            float delta_time = fl_current_time - fl_previous_time;

            if (delta_time > 0.15f) {
                delta_time = 0.15f;
            }
            this.update(delta_time);
        }
    }


    public void start() {
        game_thread = new Thread(this);
        game_thread.start();
        game_running_status = true;
    }

    public void stop() {

        try {
            game_thread.join();
            game_running_status = false;
            game_pane = null;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void update(float delta_time) {
        System.out.println("dt " + delta_time);
    }


}
