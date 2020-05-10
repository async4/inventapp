package com.invent.app_common.window_inventory.weapons_menu.smgs_menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class smg_menu_pane extends JPanel implements MouseListener {
    private static smg_menu_pane _smg_menu_pane;
    public smg_menu_pane() {
        this.add(new JLabel("Smg's"));
        this.setBackground(new Color(26, 26, 26));
        this.setPreferredSize(new Dimension(250, 170));
        this.addMouseListener(this);
    }

    public static smg_menu_pane create_smg_menu_pane() {
        if (_smg_menu_pane == null) {
            _smg_menu_pane = new smg_menu_pane();
        }
        return _smg_menu_pane;
    }

    public static smg_menu_pane get_smg_menu_pane() {
        return _smg_menu_pane;
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
