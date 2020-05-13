package com.inventory.app_common.window_canvas.user_pane;

import javax.swing.*;
import java.awt.*;

public class user_soldier_image extends JPanel {

    public user_soldier_image() {
        this.setPreferredSize(new Dimension(300, 500));
        this.setBackground(new Color(33, 33, 33));

        JLabel soldier_image = new JLabel();
        soldier_image.setPreferredSize(new Dimension(260, 510));
        soldier_image.setIcon(new ImageIcon(this.getClass().getResource("/img/user_panel/preview_idle.gif")));
        this.add(soldier_image);
    }
}
