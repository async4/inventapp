package com.invent;

import com.invent.app_common.app_content_pane;
import com.invent.app_common.app_window;
import com.invent.app_dal.get_weapon_data.weapon_data;

import javax.swing.*;

public class Main {

    private static void init() {
        // Ana ekran app_window sinifindan türetilir.
        app_window frame = new app_window();

        weapon_data.get_weapon_data();

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
