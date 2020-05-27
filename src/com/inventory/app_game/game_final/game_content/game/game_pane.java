package com.inventory.app_game.game_final.game_content.game;

import com.inventory.app_common.window_properties;
import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_common.game_object.object_tag;
import com.inventory.app_game.game_common.game_target_spawner.target_spawner;
import com.inventory.app_game.game_data.game_data;
import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;
import com.inventory.app_game.game_final.game_hud.game_hud;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_scripts.controller.controller_fire;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_scripts.controller.controller_movement;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_scripts.controller.controller_reload;
import com.inventory.app_game.game_scripts.game_hud_scripts.change_weapon;

import java.awt.*;
import java.awt.image.BufferStrategy;


public class game_pane extends Canvas implements Runnable {

    private static game_pane game_pane;

    private Thread thread;
    private boolean game_running_status = false;

    private game_handler handler;
    private game_hud hud;



    public game_pane() {
        handler = new game_handler();

        for (int i = 0; i < 10; i++) {
            target_spawner.spawn(handler);
        }

        handler.add_object(
            new operator(object_tag.operator,window_properties.WIDTH / 2 - 32,window_properties.HEIGHT / 2 - 32, game_data.weapons)
        );

        hud = new game_hud();


        this.addKeyListener(new change_weapon(hud));

        this.addKeyListener(new controller_reload(handler));
        this.addMouseMotionListener(new controller_movement(handler));
        this.addMouseListener(new controller_fire(handler));
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
        long previous_time = System.nanoTime();
        double aot = 60.0;
        double ns = 1e9 / aot;
        double delta_time = 0.0;
        long timer = System.currentTimeMillis();
        int frames = 0;

        while (this.game_running_status) {
            long current_time = System.nanoTime();
            delta_time += (current_time - previous_time) / ns;
            previous_time = current_time;

            while (delta_time >= 1) {
                update();
                delta_time--;
            }

            if (this.game_running_status) {
                render();
            }
            frames++;

            if (System.currentTimeMillis() - timer > 1e3) {
                timer += 1e3;
                frames = 0;
            }
        }
    }


    public synchronized void update() {
        handler.update();
        hud.update();
    }


    private void render() {
        BufferStrategy buffer_strategy = this.getBufferStrategy();
        if (buffer_strategy == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = buffer_strategy.getDrawGraphics();

        g.setColor(new Color(53, 53, 53));
        g.fillRect(0, 0, window_properties.WIDTH, window_properties.HEIGHT);

        hud.render(g);
        handler.render(g);

        g.dispose();
        buffer_strategy.show();
    }
}