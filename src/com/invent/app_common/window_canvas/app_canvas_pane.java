package com.invent.app_common.window_canvas;

import javax.swing.*;
import java.awt.*;

public class app_canvas_pane extends JPanel {
    private static app_canvas_pane canvas_pane;
    private final Color canvas_pane_background_color = new Color( 23, 21, 26);

    public app_canvas_pane(){
        this.setBackground(canvas_pane_background_color);
        this.add(new JLabel("SHOW INVENTORY AND WEAPON PROPERTIES"));
    }

    public static app_canvas_pane create_canvas_pane() {
        if (canvas_pane == null) {
            canvas_pane = new app_canvas_pane();
        }
        return canvas_pane;
    }

    public static app_canvas_pane get_canvas_pane() {
        return canvas_pane;
    }

    public void update_canvas_pane() {
        this.validate();
        this.repaint();
    }
}
