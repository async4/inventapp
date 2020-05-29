package com.inventory.app_final.pane_weapons.scripts.pane;

import com.inventory.app_final.pane_weapons.components.weapon_pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class pane_highlight extends MouseAdapter {

    private final weapon_pane pane;
    private final Color BORDER_COLOR = new Color(240, 240, 240);


    public pane_highlight(weapon_pane pane) {
        this.pane = pane;
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        pane.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 1));
    }


    @Override
    public void mouseExited(MouseEvent e) {
        pane.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 0));
    }

}
