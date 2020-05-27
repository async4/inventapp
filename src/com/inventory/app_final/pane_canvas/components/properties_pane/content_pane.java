package com.inventory.app_final.pane_canvas.components.properties_pane;

import javax.swing.*;
import java.awt.*;


public class content_pane extends JPanel {

    private static content_pane content;


    public content_pane() {
        this.setBackground(new Color(33, 33, 33));
        this.setPreferredSize(new Dimension(550, 520));
        this.add(new image());
        this.add(new properties());

        this.setVisible(false);
    }


    public static content_pane create_content_pane() {
        if (content == null) {
            content = new content_pane();
        }
        return content;
    }


    public static content_pane get_content_pane() {
        return content;
    }

}
