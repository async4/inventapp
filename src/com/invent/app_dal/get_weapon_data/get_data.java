package com.invent.app_dal.get_weapon_data;


import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class get_data {

    public static void connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:/home/async/Desktop/inventapp/res/weapon_data/main_weapons.sql";
            conn = DriverManager.getConnection(url);
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }


}
