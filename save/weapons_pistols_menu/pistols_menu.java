package com.invent.app_common.window_inventory.weapons_menu.weapons_pistols_menu;

import com.invent.app_common.window_canvas.app_canvas_pane;
import com.invent.app_common.window_canvas.user_pane.user_pane;
import com.invent.app_common.window_canvas.weapon_pane.weapon_pane;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class pistols_menu extends JMenu implements MouseListener {
    private static pistols_menu _pistols_menu;

    public pistols_menu() {
        this.setText("Pistols");
        this.addMouseListener(this);
    }

    public static pistols_menu create_pistols_menu() {
        if (_pistols_menu == null) {
            _pistols_menu = new pistols_menu();
        }
        return _pistols_menu;
    }

    public static pistols_menu get_pistols_menu() {
        return _pistols_menu;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        weapon_pane.get_show_weapon_pane().setVisible(true);

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
