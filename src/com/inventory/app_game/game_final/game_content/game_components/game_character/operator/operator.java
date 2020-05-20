package com.inventory.app_game.game_final.game_content.game_components.game_character.operator;

import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class operator extends game_object {

    public operator(object_tag tag, int position_x, int position_y, double angle) {
        super(tag, position_x, position_y, angle);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(position_x, position_y, 3, 3);

        Graphics2D g2d = (Graphics2D) g;

        g2d.rotate(
        Math.atan2(position_y - mouse_y, position_x - mouse_x) - Math.PI / 2 + 0.68,
              position_x,
              position_y
        );

        g.setColor(new Color(191, 197, 199));
        g2d.draw(new Ellipse2D.Double(position_x, position_y, 32, 32));
    }
}




