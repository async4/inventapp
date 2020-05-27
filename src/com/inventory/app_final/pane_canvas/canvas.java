package com.inventory.app_final.pane_canvas;

import com.inventory.app_final.pane_canvas.components.choices_pane.choices_pane;
import com.inventory.app_final.pane_canvas.components.properties_pane.content_pane;

import javax.swing.*;
import java.awt.*;


public class canvas extends JPanel {

    // Panel arkaplan rengi.
    private final Color canvas_pane_background_color = new Color(26, 26, 26);


    public canvas() {
        this.setBackground(canvas_pane_background_color);
        JLabel title = new JLabel("INVENTORY AND WEAPON PROPERTIES");
        title.setForeground(new Color(166, 166, 166));
        this.add(title);
        this.add(choices_pane.create_choices_pane());
        this.add(content_pane.create_content_pane());
    }

}
