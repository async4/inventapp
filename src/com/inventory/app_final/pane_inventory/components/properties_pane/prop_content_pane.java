package com.inventory.app_final.pane_inventory.components.properties_pane;

import javax.swing.*;
import java.awt.*;


public class prop_content_pane extends JPanel {

    private static prop_content_pane content;


    public prop_content_pane() {
        this.setBackground(new Color(33, 33, 33));
        this.setPreferredSize(new Dimension(550, 520));
        this.add(new image_pane());
        this.add(new properties_pane());

        this.setVisible(false);
    }


    public static prop_content_pane create_prop_content_pane() {
        if (content == null) {
            content = new prop_content_pane();
        }
        return content;
    }


    public static prop_content_pane get_prop_content_pane() {
        return content;
    }

}
