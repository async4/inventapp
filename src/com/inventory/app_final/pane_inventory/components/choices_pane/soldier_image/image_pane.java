package com.inventory.app_final.pane_inventory.components.choices_pane.soldier_image;

import javax.swing.*;
import java.awt.*;


public class image_pane extends JPanel {
    private final Dimension PANE_SIZE = new Dimension(300, 500);
    private final Color PANE_COLOR = new Color(33, 33, 33);
    private final Dimension IMG_LABE_SIZE = new Dimension(260, 510);
    private final String IMG_PATH = "/img/user_panel/preview_idle.gif";


    public image_pane() {
        JLabel soldier_image = new JLabel();
        soldier_image.setPreferredSize(IMG_LABE_SIZE);
        soldier_image.setIcon(new ImageIcon(this.getClass().getResource(IMG_PATH)));
        this.add(soldier_image);

        this.setPreferredSize(PANE_SIZE);
        this.setBackground(PANE_COLOR);
    }
}