package com.invent;

import com.invent.app_common.app_content_pane;
import com.invent.app_common.app_window;

import javax.swing.*;

public class Main {

    private static void init() {
        // Ana ekran app_window sinifindan türetilir.
        app_window frame = new app_window();

        // Ana ekranin uzerine icerik paneli eklenir.
        frame.add(new app_content_pane());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                init();
            }
        });
    }
}
