package com.invent.app_common.window_inventory.weapons_menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class weapons_menu extends JMenu implements MouseListener {
    private static weapons_menu _weapons_menu;
    public weapons_menu() {
        this.setText("Weapons");
        this.add(Box.createRigidArea(new Dimension(200,25)));
        this.addMouseListener(this);
    }

    public static weapons_menu create_weapons_menu() {
        if (_weapons_menu == null) {
            _weapons_menu = new weapons_menu();
        }
        return _weapons_menu;
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
