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

    private Thread thread;
    private boolean game_running_status = false;

    private game_handler handler;
    private game_hud hud;


    public game_pane() {
        // Oyundaki oyun objelerini kontrol eden sinif.
        handler = new game_handler();

        // Oyun basladiginda ekranda 10 adet hedef olusturulur.
        for (int i = 0; i < 10; i++) {
            target_spawner.spawn(handler);
        }

        // Oyuna yeni bir operator(asker) eklenir.
        handler.add_object(
            new operator(object_tag.operator,window_properties.WIDTH / 2 - 32,window_properties.HEIGHT / 2 - 32, game_data.weapons)
        );

        // Ekranda kullanilan silah ve o silaha ait mermi ve mermi kapasitesi sol ust kosede gosterecek olan sinif.
        hud = new game_hud();

        // Silahlari degistirebilmek icin atanan tuslar dinlemeye alinir..
        this.addKeyListener(new change_weapon(hud));

        // R tusu dinlemeye alinir. Mermi kapasitesi 0 oldugunda kullanici R tusu ile reload yapabilir.
        this.addKeyListener(new controller_reload(handler));

        // Kullanicinin mouse hareketleri dinlemeye alinir.
        this.addMouseMotionListener(new controller_movement(handler));

        // Kullanicinin mouse ile yapacagi aksiyonlar dinlemeye alinir.
        this.addMouseListener(new controller_fire(handler));
    }


    public synchronized void start() {
        /*
            Threadler farkli islemlerin ayni anda yurutulmesinde yardimci olan yapilardir.

            Calisan birden fazla fonksiyon ayni anda calisir ve birbirlerini etkilemezler.

            Bu sayede ates ederken ayni zamanda kullanici mouse unu farkli bir konuma getirebilir,
            atanmis olan tuslara basabilir ve ekran uzerinde giden mermi objesi surekli olarak kendini guncelleyebilir.
         */
        thread = new Thread(this);
        thread.start();

        // Oyun basladiginda oyun statusu true yapilir.
        this.game_running_status = true;
    }


    public synchronized void stop() {
        // Oyun bittiginde oyun statusu false yapilir.
        this.game_running_status = false;
    }


    @Override
    public void run() {
        long previous_time = System.nanoTime();
        double aot = 60.0;
        double ns = 1e9 / aot;

        /*
            Delta Time bilgisayarin bir onceki frame i tamamlamasi icin gereken suredir.
         */
        double delta_time = 0.0;
        long timer = System.currentTimeMillis();
        int frames = 0; // FPS

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
        // https://docs.oracle.com/javase/tutorial/extra/fullscreen/bufferstrategy.html
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