package com.inventory.app_game.game_scripts.game_final_scripts.other_scripts.bullet_scripts;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;
import com.inventory.app_game.game_common.game_target_spawner.target_spawner;
import com.inventory.app_game.game_final.game_content.game_components.other.bullet;

public abstract class bullet_action {

    public static void bullet_exit(game_handler handler, game_object operator_object, double mouse_x, double mouse_y) {
        game_object temp_bullet = handler.add_object(
            new bullet(object_tag.bullet, handler, operator_object.getPosition_x(), operator_object.getPosition_y())
        );

        // Kesin konumu alabilmek icin atan yerine atan2 kullanilir.
        // Atan2 de acinin hangi bolgede oldugunu, isaretini vs. gosterir.
        double angle = Math.atan2(mouse_y - operator_object.getPosition_y(), mouse_x - operator_object.getPosition_x());

        // 6 px acinin cos'u boyunca ekranda hareket eder.
        ((bullet) temp_bullet).setBullet_velocity_x((float) (6 * Math.cos(angle)));

        // 6 px acinin sin'u boyunca ekranda hareket eder.
        ((bullet) temp_bullet).setBullet_velocity_y((float) (6 * Math.sin(angle)));
    }


    public static void bullet_collision(game_handler handler, game_object object, bullet bullet) {
        if (object.getTag() == object_tag.target) {
            if (bullet.get_bounds().intersects(object.get_bounds())) {
                // Eger target'in sinirlari ile bullet'in sinirlari birbirine carparsa.

                // Target'i sil
                handler.remove_object(object);

                // Bullet'i sil
                handler.remove_object(bullet);

                // Yeni bir target olustur.
                target_spawner.spawn(handler);
            }
        }
    }

}