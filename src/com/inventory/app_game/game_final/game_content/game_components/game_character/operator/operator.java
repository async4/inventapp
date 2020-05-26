package com.inventory.app_game.game_final.game_content.game_components.game_character.operator;

import com.inventory.app_game.game_common.game_object.game_object;
import com.inventory.app_game.game_common.game_object.object_tag;
import com.inventory.app_game.game_data.selected_weapon.selected_weapon;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;


public class operator extends game_object {
    public static selected_weapon current_weapon;
    public static ArrayList<selected_weapon> weapons;

    public static boolean reloading = false;
    public static boolean waiting = false;

    public operator(object_tag tag, double position_x, double position_y, double angle, ArrayList<selected_weapon> weapons) {
        super(tag, position_x, position_y);

        current_weapon = weapons.get(0);
        this.weapons = weapons;
    }


    public Rectangle get_bounds() {
        return new Rectangle((int) position_x, (int) position_y, 9, 9);
    }

    @Override
    public void update() {}


    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(191, 197, 199));
        g2d.draw(get_bounds());
    }

}