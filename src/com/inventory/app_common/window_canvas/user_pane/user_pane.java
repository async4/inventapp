package com.inventory.app_common.window_canvas.user_pane;

import com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_weapon_pane;
import com.inventory.app_common.window_canvas.user_pane.soldier_image_pane.user_soldier_image;

import javax.swing.*;
import java.awt.*;


public class user_pane extends JSplitPane {
    private static user_pane _user_pane;

    private final Dimension PANE_SIZE = new Dimension(550, 520);
    private final Color PANE_COLOR = new Color(53, 53, 53);
    private final int DIVIDER_LOC = 260;

    public user_pane() {
        this.setPreferredSize(PANE_SIZE);
        this.setBorder(BorderFactory.createLineBorder(PANE_COLOR, 1, false));
        this.setEnabled(false);
        this.setDividerSize(0);
        this.setOrientation(1);
        this.setLeftComponent(new user_soldier_image());
        this.setRightComponent(new selected_weapon_pane());
        this.setDividerLocation(DIVIDER_LOC);
        this.setVisible(true);
    }


    public static user_pane create_user_pane() {
        if (_user_pane == null) {
            _user_pane = new user_pane();
        }
        return _user_pane;
    }


    public static user_pane get_user_pane() {
        return _user_pane;
    }
}
