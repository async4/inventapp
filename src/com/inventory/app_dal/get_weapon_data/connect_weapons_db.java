package com.inventory.app_dal.get_weapon_data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connect_weapons_db {
    public static Connection connect() {
        Connection connection = null;

        // Veritabanimizin bulundugu path (jdbc driveri gereklidir. -> https://bitbucket.org/xerial/sqlite-jdbc/downloads/)
        String weapons_db_path = "jdbc:sqlite:res/weapon_data/weapons_properties";

        try {
            // Veritabanina baglanilir.
            connection = DriverManager.getConnection(weapons_db_path);
        } catch (SQLException e) {
            // Baglantida sorun cikarsa hata mesaji gosterilir.
            System.out.println(e.getMessage());
        }

        // Baglanti sorunsuz veya sorunlu her iki durumda da baglanti geri gonderilir.
        return connection;
    }
}