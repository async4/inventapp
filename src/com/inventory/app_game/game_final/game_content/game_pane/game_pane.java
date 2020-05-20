package com.inventory.app_game.game_final.game_content.game_pane;

import com.inventory.app_business.window_properties.window_properties;
import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_common.game_object.object_tag;
import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.character_action;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.character_movement;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class game_pane extends Canvas implements Runnable {
    private static game_pane game_pane;

    private Thread thread;
    private boolean game_running_status = false;

    private game_handler game_handler;


    public game_pane() {
        game_handler = new game_handler();
        game_handler.add_object(
            new operator(object_tag.operator,window_properties.WIDTH / 2 - 32,window_properties.HEIGHT / 2 - 32, 0.0)
        );
        this.addMouseMotionListener(new character_movement(game_handler));
        this.addMouseListener(new character_action(game_handler));

    }

    public static game_pane create_game_pane() {
        if (game_pane == null) {
            game_pane = new game_pane();
        }
        return game_pane;
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        this.game_running_status = true;
    }

    public synchronized void stop() {
        this.game_running_status = false;
        game_pane = null;
    }


    @Override
    public void run() {
        long last_time = System.nanoTime();
        final int FPS = 60;
        final double OPTIMAL_TIME = 1e9 / FPS;

        double accumulator = 0f;
        double delta_time;
        double interval = 1f / FPS;
        double alpha;

        while (this.game_running_status) {
            long now = System.nanoTime();
            long update_length = now - last_time;
            last_time = now;
            delta_time = update_length / (double) OPTIMAL_TIME;

            accumulator += delta_time;

            while (accumulator >= interval) {
                update();
                accumulator -= interval;
            }

            alpha = accumulator / interval;
            render(alpha);
        }
    }

    public synchronized void update() {

    }

    private void render(double alpha) {
        BufferStrategy buffer_strategy = this.getBufferStrategy();
        if (buffer_strategy == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = buffer_strategy.getDrawGraphics();

        g.setColor(new Color(53, 53, 53));
        g.fillRect(0, 0, window_properties.WIDTH, window_properties.HEIGHT);

        game_handler.render(g);

        g.dispose();
        buffer_strategy.show();
    }
}
