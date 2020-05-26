package com.inventory.app_game.game_final.game_content.game_components.game_character.target;

import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class target extends game_object {

    public target(object_tag tag, int position_x, int position_y) {
        super(tag, position_x, position_y);

    }

    public Rectangle get_bounds() {
        return new Rectangle((int) position_x, (int) position_y, 10, 10);
    }

    @Override
    public void update() {}



    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.red);
        g2d.draw(this.get_bounds());
    }

}