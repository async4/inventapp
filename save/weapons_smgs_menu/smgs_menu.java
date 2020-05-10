package com.invent.app_common.window_inventory.weapons_menu.weapons_smgs_menu;

import com.invent.app_common.window_canvas.user_pane.user_pane;
import com.invent.app_common.window_canvas.weapon_pane.weapon_pane;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class smgs_menu extends JMenu implements MouseListener {
    private static smgs_menu _smgs_menu;

    public smgs_menu() {
        this.setText("Smg's");
        this.addMouseListener(this);
    }

    public static smgs_menu create_smgs_menu() {
        if (_smgs_menu == null) {
            _smgs_menu = new smgs_menu();
        }
        return _smgs_menu;
    }

    public static smgs_menu get_smgs_menu() {
        return _smgs_menu;
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
