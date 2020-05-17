package com.inventory.app_game.game_window;

import com.inventory.app_business.window_properties.window_properties;
import com.inventory.app_common.app_window;
import com.inventory.app_game.game_content.game_final.game_pane.game_pane;
import com.inventory.app_game.game_content.game_ui.game_ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class game_window extends window_properties implements WindowListener {
    private static game_window game_window;

    private game_window() {
        super();

        this.add(new game_pane());
        this.add(new game_ui());

        // Pencerenin kapatma dugmesine basilinca yapilacak olan islem.
        // Eger bu satir eklenmez ise carpi butonuna basilsa bile program arkaplanda calismaya devam eder.
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        this.addWindowListener(this);
    }

    public static void create_game_window() {

        if (game_window != null) {
            game_window = null;
        }

        game_window = new game_window();
    }

    public static game_window getGame_window() {
        return game_window;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        app_window.get_app_window().setVisible(false);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        app_window.get_app_window().setVisible(true);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
