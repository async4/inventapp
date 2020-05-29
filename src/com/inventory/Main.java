/*
	GROUP: 2A (IO)

	Name: Sergen
	Surname: Cepoglu
	Number: 02195076070

	Name: Oguzhan
	Surname: Celik
	Number: 02195076023

	Selected Project: 3
	Presentation Date: 08.06.2020

	Additional: https://github.com/async4/inventapp
*/

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
