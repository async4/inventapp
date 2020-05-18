package com.inventory.app_game.game_final.game_content.game_components.game_character.operator;

import com.inventory.app_game.game_data.game_data;

import javax.swing.*;
import java.awt.*;

public class operator extends JPanel {
    private game_data current_weapon_data;

    private int coordinate_X, coordinate_y;


    public operator(game_data current_weapon_data) {
        this.current_weapon_data = current_weapon_data;

        this.setBackground(new Color(219, 223, 226));
        this.setPreferredSize(new Dimension(96, 96));

        operator_label operator = new operator_label();
        this.add(operator);
    }
}
