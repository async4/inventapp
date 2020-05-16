package com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane;

import com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_pane.selected_pistol_pane;
import com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_pane.selected_rifle_pane;
import com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_pane.selected_smg_pane;

import javax.swing.*;
import java.awt.*;

public class selected_weapon_pane extends JPanel {

    public selected_weapon_pane() {
        this.setBackground(new Color(33, 33, 33));
        this.add(new selected_pistol_pane());
        this.add(new selected_smg_pane());
        this.add(new selected_rifle_pane());
    }
}
