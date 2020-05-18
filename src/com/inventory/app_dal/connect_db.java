package com.inventory.app_dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class connect_db {
    private final static String JDBC_DRIVER_PATH = "jdbc:sqlite:res/db/";

    public static Connection connect(String database_name) {
        Connection connection = null;

        // Veritabanimizin bulundugu path (jdbc driveri gereklidir. -> https://bitbucket.org/xerial/sqlite-jdbc/downloads/)
        final String FULL_PATH = JDBC_DRIVER_PATH + database_name;

        try {
            // Veritabanina baglanilir.
            connection = DriverManager.getConnection(FULL_PATH);
        } catch (SQLException e) {
            // Baglantida sorun cikarsa hata mesaji gosterilir.
            System.out.println(e.getMessage());
        }

        // Baglanti sorunsuz veya sorunlu her iki durumda da baglanti geri gonderilir.
        return connection;
    }
}