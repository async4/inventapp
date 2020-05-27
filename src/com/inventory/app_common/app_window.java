package com.inventory.app_common;

import com.inventory.app_business.window_properties.window_properties;

import javax.swing.*;


public class app_window extends window_properties {

    private static app_window app_window;

    private app_window() {
        super();

        // Pencerenin kapatma dugmesine basilinca yapilacak olan islem.
        // Eger bu satir eklenmez ise carpi butonuna basilsa bile program arkaplanda calismaya devam eder.
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static app_window create_app_window() {
        if (app_window == null) {
            app_window = new app_window();
        }
        return app_window;
    }


    public static app_window get_app_window() {
        return app_window;
    }
}
