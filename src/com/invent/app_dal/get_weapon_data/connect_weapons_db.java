package com.invent.app_dal.get_weapon_data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connect_weapons_db {
    public static Connection connect() {
        Connection connection = null;
        String weapons_db_path = "jdbc:sqlite:res/weapon_data/weapons_properties";

        try {
            connection = DriverManager.getConnection(weapons_db_path);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }
}
