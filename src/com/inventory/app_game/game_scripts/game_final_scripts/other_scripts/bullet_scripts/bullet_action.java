package com.inventory.app_game.game_scripts.game_final_scripts.other_scripts.bullet_scripts;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;
import com.inventory.app_game.game_final.game_content.game_components.other.bullet;

public abstract class bullet_action {

    public static void bullet_exit(game_handler handler, game_object operator_object, double mouse_x, double mouse_y) {
        game_object temp_bullet = handler.add_object(
            new bullet(object_tag.bullet, handler, operator_object.getPosition_x(), operator_object.getPosition_y())
        );

        double angle = Math.atan2(mouse_y - operator_object.getPosition_y(), mouse_x - operator_object.getPosition_x());


        ((bullet) temp_bullet).setBullet_velocity_x((float) (5 * Math.cos(angle)));
        ((bullet) temp_bullet).setBullet_velocity_y((float) (5 * Math.sin(angle)));


    }

    public static void bullet_collision(game_handler handler, game_object object, bullet bullet) {
        if (object.getTag() == object_tag.target) {
            if (bullet.get_bounds().intersects(object.get_bounds())) {
                handler.remove_object(object);
                handler.remove_object(bullet);
            }
        }
    }

}

        /*
        System.out.println("mouse y: " + mouse_y + " mouse x: " + mouse_x);

        System.out.println("position y: " + operator_object.getPosition_y() + " position x: " + operator_object.getPosition_x());


        double angle = Math.atan2(mouse_y - operator_object.getPosition_y(), mouse_x - operator_object.getPosition_x());
        System.out.println("atan2(y, x): " + angle);

        System.out.println("cos(deg): " + Math.cos(angle) + " sin(deg): " + Math.sin(angle));

        // float angle = (float) Math.atan2(mouse_y - operator_object.getPosition_y(), mouse_x - operator_object.getPosition_x());
         */