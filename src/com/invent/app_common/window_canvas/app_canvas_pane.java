package com.invent.app_common.window_canvas;

import com.invent.app_common.window_canvas.user_pane.user_pane;
import com.invent.app_common.window_canvas.weapon_pane.weapon_pane;

import javax.swing.*;
import java.awt.*;

public class app_canvas_pane extends JPanel {
    // Uretilen nesneyi tutacak olan degisken.
    private static app_canvas_pane canvas_pane;

    // Panel arkaplan rengi.
    private final Color canvas_pane_background_color = new Color( 23, 21, 26);

    public app_canvas_pane(){
        this.setBackground(canvas_pane_background_color);
        this.add(new JLabel("SHOW INVENTORY AND WEAPON PROPERTIES"));
        this.add(user_pane.create_user_pane());
        this.add(weapon_pane.create_weapon_pane());
    }

    // Panel nesnesinin tekrardan uretilmesini engellemek icin ve nesneye rahatca ulasmak icin.
    public static app_canvas_pane create_canvas_pane() {
        // eger daha onceden panel olusturulmamis ise panel nesne olusturulur.
        if (canvas_pane == null) {
            canvas_pane = new app_canvas_pane();
        }
        return canvas_pane;
    }

    // Olusturulan panel nesnesi geri dondurulur.
    public static app_canvas_pane get_canvas_pane() {
        return canvas_pane;
    }

    public void update_canvas_pane() {
        this.validate();
        this.repaint();
    }
}
