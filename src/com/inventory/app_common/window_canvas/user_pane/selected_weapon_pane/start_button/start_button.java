package com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.start_button;

import com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_pane.selected_pistol_pane;
import com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_pane.selected_rifle_pane;
import com.inventory.app_common.window_canvas.user_pane.selected_weapon_pane.selected_pane.selected_smg_pane;
import com.inventory.app_components.app_weapons.weapon;
import com.inventory.app_dal.connect_db;
import com.inventory.app_game.game_data.game_data;
import com.inventory.app_game.game_window.game_window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class start_button extends JLabel implements MouseListener {

    public start_button() {
        this.setText("Start");
        this.setBackground(new Color(26, 26, 26));
        this.setBorder(BorderFactory.createLineBorder(new Color(53, 53, 53)));
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(150, 40));
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setForeground(new Color(53, 53, 53));
        this.addMouseListener(this);
    }

    private void write_database(weapon pistol, weapon smg, weapon rifle) {
        final Connection CONNECTION = connect_db.connect("selected_weapons");

        final String SQL_COMMAND = "INSERT INTO " + "selected_weapons" + "VALUES ('test', 10, 20, 'test2')";

        try {
            Statement statement  = CONNECTION.createStatement();
            statement.executeQuery(SQL_COMMAND);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (selected_pistol_pane.getSelected_weapon_data() != null && selected_smg_pane.getSelected_weapon_data() != null && selected_rifle_pane.getSelected_weapon_data() != null) {

            // write_database(selected_pistol_pane.getSelected_weapon_data(), selected_smg_pane.getSelected_weapon_data(), selected_rifle_pane.getSelected_weapon_data());

            new game_data(selected_pistol_pane.getSelected_weapon_data(), selected_smg_pane.getSelected_weapon_data(), selected_rifle_pane.getSelected_weapon_data());

            game_window.create_game_window();
        }
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        this.setForeground(new Color(252, 252, 252));
        this.setBorder(BorderFactory.createLineBorder(new Color(208, 208, 208)));
    }


    @Override
    public void mouseExited(MouseEvent e) {
        this.setForeground(new Color(53, 53, 53));
        this.setBorder(BorderFactory.createLineBorder(new Color(53, 53, 53)));
    }


    @Override
    public void mousePressed(MouseEvent e) {
    }


    @Override
    public void mouseReleased(MouseEvent e) {
    }


}
