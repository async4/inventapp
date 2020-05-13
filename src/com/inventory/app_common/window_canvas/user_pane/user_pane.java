package com.inventory.app_common.window_canvas.user_pane;

import com.inventory.app_common.window_canvas.user_pane.user_choices_menu.choices_menu;

import javax.swing.*;
import java.awt.*;


public class user_pane extends JSplitPane {
    public static user_pane _user_pane;
    public user_pane() {
        this.setPreferredSize(new Dimension(550, 520));
        this.setBorder(BorderFactory.createLineBorder(new Color(53, 53, 53), 1, false));

        this.setEnabled(false);
        this.setDividerSize(0);
        this.setOrientation(1);
        this.setLeftComponent(new user_soldier_image());
        this.setRightComponent(new choices_menu());
        this.setDividerLocation(260);

        this.setVisible(true);
    }

    public static user_pane create_user_pane() {
        if (_user_pane == null) {
            _user_pane = new user_pane();
        }
        return _user_pane;
    }

    public static user_pane get_show_user_pane() {
        return _user_pane;
    }
}
