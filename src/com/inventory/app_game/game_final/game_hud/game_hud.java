package com.inventory.app_game.game_final.game_hud;

import com.inventory.app_components.app_weapons.weapon;
import com.inventory.app_game.game_data.game_data;
import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;

import java.awt.*;


public class game_hud {

    public game_hud() {
    }


    public void update() {

    }


    public void render(Graphics g) {
        g.setColor(new Color(209, 224, 227));

        /*
        g.drawString(pistol.getCategory() + " [ " + pistol.getName() + " ]", 10, 15);
        g.drawString(smg.getCategory() + " [ " + smg.getName() + " ]", 10, 30);
        g.drawString(rifle.getCategory() + " [ " + rifle.getName() + " ]", 10, 45);

         */

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(204, 214, 218));
    }
}
