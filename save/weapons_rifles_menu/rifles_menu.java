package com.invent.app_common.window_inventory.weapons_menu.weapons_rifles_menu;

import com.invent.app_common.window_canvas.user_pane.user_pane;
import com.invent.app_common.window_canvas.weapon_pane.weapon_pane;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class rifles_menu extends JMenu implements MouseListener {
    private static rifles_menu _rifles_menu;

    public rifles_menu() {
        this.setText("Rifles");
        this.addMouseListener(this);
    }

    public static rifles_menu create_rifles_menu() {
        if (_rifles_menu == null) {
            _rifles_menu = new rifles_menu();
        }
        return _rifles_menu;
    }

    public static rifles_menu get_smgs_menu() {
        return _rifles_menu;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        weapon_pane.get_show_weapon_pane().setVisible(true);
        user_pane.get_show_user_pane().setVisible(false);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        weapon_pane.get_show_weapon_pane().setVisible(false);
        user_pane.get_show_user_pane().setVisible(true);

    }
}
