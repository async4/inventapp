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

        this.game = new game_pane();
        this.add(this.game);

        // Farenin imleci degistirilir.
        this.setCursor(Cursor.CROSSHAIR_CURSOR);

        // oyun  ekraninda carpi butonuna basildiginde kapatmak yerine gizliyoruz.
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE );
        this.addWindowListener(this);
    }


    @Override
    public void windowOpened(WindowEvent e) {
        // Oyun ekrani acildiginda..
        this.setTitle("Game");

        // Ana ekran gizlenir.
        window_frame.get_app_window().setVisible(false);

        // Oyun baslatilir.
        this.game.start();
    }


    @Override
    public void windowClosing(WindowEvent e) {
        // Oyun ekrani kapatildiginda..
        // Ana ekran tekrardan aktif edilir.
        window_frame.get_app_window().setVisible(true);

        // Oyun durdurulur.
        this.game.stop();

        // olusturulmus olan oyun paneli null yapilir bu sayede oyun arkaplanda calismaya devam etmez.
        game = null;
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
