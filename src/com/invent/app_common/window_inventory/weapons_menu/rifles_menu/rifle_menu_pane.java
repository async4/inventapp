package com.invent.app_common.window_inventory.weapons_menu.rifles_menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class rifle_menu_pane extends JPanel implements MouseListener {
    private static rifle_menu_pane _rifle_menu_pane;
    public rifle_menu_pane() {
        this.add(new JLabel("Rifles"));
        this.setBackground(new Color(26, 26, 26));
        this.setPreferredSize(new Dimension(250, 170));
        this.addMouseListener(this);
    }

    public static rifle_menu_pane create_rifle_menu_pane() {
        if (_rifle_menu_pane == null) {
            _rifle_menu_pane = new rifle_menu_pane();
        }
        return _rifle_menu_pane;
    }

    public static rifle_menu_pane get_rifle_menu_pane() {
        return _rifle_menu_pane;
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
        this.setBackground(new Color(47, 47, 47));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(26, 26, 26));
    }
}

