package com.invent.app_common.window_inventory.weapons_menu.pistols_menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class pistol_menu_pane extends JPanel implements MouseListener {
    private static pistol_menu_pane _pistol_menu_pane;
    public pistol_menu_pane() {
        this.add(new JLabel("Pistols"));
        this.setBackground(new Color(26, 26, 26));
        this.setPreferredSize(new Dimension(250, 170));
        this.addMouseListener(this);
    }

    public static pistol_menu_pane create_pistol_menu() {
        if (_pistol_menu_pane == null) {
            _pistol_menu_pane = new pistol_menu_pane();
        }
        return _pistol_menu_pane;
    }

    public static pistol_menu_pane get_pistol_menu_pane() {
        return _pistol_menu_pane;
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
