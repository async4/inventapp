package com.inventory.app_common.window_canvas.user_pane.user_choices_menu.selected_weapons;

import javax.swing.*;
import java.awt.*;

public abstract class selected_weapon extends JPanel {

    public selected_weapon() {
        this.setPreferredSize(new Dimension(250, 150));
        this.setBackground(new Color(24, 24, 24));
        this.setBorder(BorderFactory.createLineBorder(new Color(53, 53, 53), 1, false));
    }
}
