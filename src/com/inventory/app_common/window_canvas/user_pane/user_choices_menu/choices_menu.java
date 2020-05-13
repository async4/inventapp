package com.inventory.app_common.window_canvas.user_pane.user_choices_menu;

import com.inventory.app_common.window_canvas.user_pane.user_choices_menu.selected_weapons.selected_pistol;
import com.inventory.app_common.window_canvas.user_pane.user_choices_menu.selected_weapons.selected_rifle;
import com.inventory.app_common.window_canvas.user_pane.user_choices_menu.selected_weapons.selected_smg;

import javax.swing.*;
import java.awt.*;

public class choices_menu extends JPanel {

    public choices_menu() {
        this.setBackground(new Color(33, 33, 33));
        this.add(new selected_pistol());
        this.add(new selected_smg());
        this.add(new selected_rifle());
        this.add(new user_start_button());
    }
}
