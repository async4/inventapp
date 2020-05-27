package com.inventory.app_final.ui;

import com.inventory.app_common.window_properties;

import javax.swing.*;


public class window_frame extends window_properties {

    private static window_frame window;

    private window_frame() {
        super();

        // Pencerenin kapatma dugmesine basilinca yapilacak olan islem.
        // Eger bu satir eklenmez ise carpi butonuna basilsa bile program arkaplanda calismaya devam eder.
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static window_frame create_app_window() {
        if (window == null) {
            window = new window_frame();
        }
        return window;
    }


    public static window_frame get_app_window() {
        return window;
    }
}
