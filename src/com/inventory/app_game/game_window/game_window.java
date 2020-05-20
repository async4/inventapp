package com.inventory.app_game.game_window;

import com.inventory.app_business.window_properties.window_properties;
import com.inventory.app_common.app_window;
import com.inventory.app_game.game_final.game_content.game_pane.game_pane;
import com.inventory.app_game.game_final.game_hud.game_hud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class game_window extends window_properties implements WindowListener {
    private static game_window game_window;

    private game_pane game;


    private game_window() {
        super();

        this.add(new game_hud());

        this.game = game_pane.create_game_pane();
        this.add(this.game);

        this.setCursor(Cursor.CROSSHAIR_CURSOR);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE );
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
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
        this.setTitle("Game");
        app_window.get_app_window().setVisible(false);
        this.game.start();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        app_window.get_app_window().setVisible(true);
        this.game.stop();
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
    public void windowDeactivated(WindowEvent e) {
    }
}
