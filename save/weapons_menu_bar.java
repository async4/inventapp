package com.invent.app_common.window_inventory.weapons_menu;

import javax.swing.*;
import java.awt.*;

public class weapons_menu_bar extends JMenuBar {
    private static weapons_menu_bar _weapons_menu_bar;

    public weapons_menu_bar() {
        this.add(Box.createRigidArea(new Dimension(0,25)));
    }

    public static weapons_menu_bar create_weapons_menu_bar() {
        if (_weapons_menu_bar == null) {
            _weapons_menu_bar = new weapons_menu_bar();
        }
        return _weapons_menu_bar;
    }

    public static weapons_menu_bar get_weapons_menu_bar() {
        return _weapons_menu_bar;
    }

}
