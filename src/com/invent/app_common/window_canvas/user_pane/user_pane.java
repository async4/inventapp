package com.invent.app_common.window_canvas.user_pane;

import javax.swing.*;
import java.awt.*;

public class user_pane extends JPanel {
    public static user_pane _user_pane;
    public user_pane() {
        this.add(new JLabel("USER"));
        this.setBackground(new Color(26, 26, 26));
        this.setVisible(true);
        this.setPreferredSize(new Dimension(580, 540));
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
