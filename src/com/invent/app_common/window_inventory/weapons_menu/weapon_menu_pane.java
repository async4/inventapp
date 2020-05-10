package com.invent.app_common.window_inventory.weapons_menu;

import com.invent.app_common.window_canvas.user_pane.user_pane;
import com.invent.app_common.window_canvas.weapon_pane.weapon_pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class weapon_menu_pane extends JPanel implements MouseListener {
    protected JLabel panel_title;
    protected Color panel_title_fore_ground_color = new Color(185, 185, 185);

    public weapon_menu_pane() {
        this.setBackground(new Color(33, 33, 33));
        this.setPreferredSize(new Dimension(250, 170));
        this.addMouseListener(this);
    }

    public void test() {
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
        this.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        panel_title.setForeground(new Color(255, 255, 255));

        weapon_pane.get_show_weapon_pane().setVisible(true);
        user_pane.get_show_user_pane().setVisible(false);
        test();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(33, 33, 33));
        this.setBorder(BorderFactory.createLineBorder(Color.white, 0, true));
        panel_title.setForeground(panel_title_fore_ground_color);

        weapon_pane.get_show_weapon_pane().setVisible(false);
        user_pane.get_show_user_pane().setVisible(true);
    }
}
