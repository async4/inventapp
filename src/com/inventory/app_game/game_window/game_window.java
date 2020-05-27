package com.inventory.app_game.game_window;

import com.inventory.app_common.window_properties;
import com.inventory.app_final.ui.window_frame;
import com.inventory.app_game.game_final.game_content.game.game_pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class game_window extends window_properties implements WindowListener {

    private game_pane game;

    public game_window() {
        super();

        this.game = game_pane.create_game_pane();
        this.add(this.game);

        this.setCursor(Cursor.CROSSHAIR_CURSOR);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE );
        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        this.setTitle("Game");
        window_frame.get_app_window().setVisible(false);
        this.game.start();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        window_frame.get_app_window().setVisible(true);
        this.game.stop();
    }

    @Override
    public void windowActivated(WindowEvent e) {
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
