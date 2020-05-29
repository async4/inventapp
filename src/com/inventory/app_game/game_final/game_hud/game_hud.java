package com.inventory.app_game.game_final.game_hud;

import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;

import java.awt.*;


public class game_hud {

    public void update() {

    }


    public void render(Graphics g) {
        g.setColor(new Color(209, 224, 227));

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(204, 214, 218));
        g2d.drawString(operator.current_weapon.name, 15, 15);
        g2d.drawString(operator.current_weapon.magazine_capacity + " / " + operator.current_weapon.total_magazine_capacity, 15, 30);
    }

}
