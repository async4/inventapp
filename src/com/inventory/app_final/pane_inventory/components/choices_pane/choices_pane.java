package com.inventory.app_final.pane_inventory.components.choices_pane;

import com.inventory.app_final.pane_inventory.components.choices_pane.soldier_image.image_pane;
import com.inventory.app_final.pane_inventory.components.choices_pane.weapon_slots.slot_pane;

import javax.swing.*;
import java.awt.*;


public class choices_pane extends JSplitPane {

    private static choices_pane _choices_pane;

    private final Dimension PANE_SIZE = new Dimension(550, 520);
    private final Color PANE_COLOR = new Color(53, 53, 53);
    private final int DIVIDER_LOC = 260;


    public choices_pane() {
        this.setPreferredSize(PANE_SIZE);
        this.setBorder(BorderFactory.createLineBorder(PANE_COLOR, 1, false));
        this.setEnabled(false);
        this.setDividerSize(0);
        this.setOrientation(1);
        this.setLeftComponent(new image_pane());
        this.setRightComponent(new slot_pane());
        this.setDividerLocation(DIVIDER_LOC);
        this.setVisible(true);
    }


    public static choices_pane create_choices_pane() {
        if (_choices_pane == null) {
            _choices_pane = new choices_pane();
        }
        return _choices_pane;
    }


    public static choices_pane get_choices_pane() {
        return _choices_pane;
    }

}
