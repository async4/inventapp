package com.inventory;

import com.inventory.app_final.ui.content_pane;
import com.inventory.app_final.ui.window_frame;
import com.inventory.app_dal.weapon_properties_data;

import javax.swing.*;


public class Main {

    private static void init() {
        // Ana ekran app_window sinifindan türetilir.
        window_frame frame = window_frame.create_app_window();

        // Veritabanindan silah verileri bellege aktarilir.
        weapon_properties_data.get_weapon_data();

        // Ana ekranin uzerine icerik paneli eklenir.
        frame.add(new content_pane());
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