package com.inventory.app_game.game_final.game_content.game_components.other;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;
import com.inventory.app_game.game_scripts.game_final_scripts.other_scripts.bullet_scripts.bullet_action;

import java.awt.*;


public class bullet extends game_object {

    private float bullet_velocity_x;
    private float bullet_velocity_y;

    private game_handler handler;

    public bullet(object_tag tag, game_handler handler, double position_x, double position_y) {
        super(tag, position_x, position_y);
        this.handler = handler;
    }


    @Override
    public void update() {
        position_x += bullet_velocity_x;
        position_y += bullet_velocity_y;

        if (position_x <= 850 && position_x >= 0 || position_y <= 550 && position_y >= 0) {
            for (int i = 0; i < handler.objects.size(); i++) {
                game_object temp = handler.objects.get(i);
                bullet_action.bullet_collision(handler, temp, this);
            }
        } else {
            handler.remove_object(this);
        }

    }

    public Rectangle get_bounds() {
        return new Rectangle((int) position_x + 1, (int) position_y + 1, 1, 1);
    }


    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(234, 176, 116));
        g2d.draw(get_bounds());
    }


    public float getBullet_velocity_x() {
        return bullet_velocity_x;
    }


    public void setBullet_velocity_x(float bullet_velocity_x) {
        this.bullet_velocity_x = bullet_velocity_x;
    }


    public float getBullet_velocity_y() {
        return bullet_velocity_y;
    }


    public void setBullet_velocity_y(float bullet_velocity_y) {
        this.bullet_velocity_y = bullet_velocity_y;
    }

}
