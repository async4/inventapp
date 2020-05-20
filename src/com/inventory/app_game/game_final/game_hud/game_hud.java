package com.inventory.app_game.game_final.game_hud;

import com.inventory.app_game.game_final.game_hud.weapon_ui_pane.weapon_ui_pane;

import javax.swing.*;
import java.awt.*;

public class game_hud extends JPanel {

    public game_hud() {
        this.setBorder(BorderFactory.createLineBorder(Color.pink, 1));
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        // this.setBackground(Color.black);
        this.add(new weapon_ui_pane());


    }

}
