package com.invent.app_common;

import javax.swing.*;
import java.awt.*;

public class app_window extends JFrame {
    public app_window() {
        // Create and set up window...
        this.setResizable(false);
        this.setTitle("InventApp");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
