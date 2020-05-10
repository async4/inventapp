package com.invent.app_common.window_inventory.weapons_menu.weapons_pistols_menu;

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

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
