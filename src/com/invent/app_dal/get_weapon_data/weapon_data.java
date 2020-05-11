package com.invent.app_dal.get_weapon_data;

import com.invent.app_components.app_weapons.weapon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class weapon_data {
    private static ArrayList<weapon> pistols_data;
    private static ArrayList<weapon> smgs_data;
    private static ArrayList<weapon> rifles_data;

    public static void get_weapon_data() {
        String sql = "SELECT * FROM weapons_properties";
        Connection connection = connect_weapons_db.connect();

        pistols_data = new ArrayList<weapon>();
        smgs_data = new ArrayList<weapon>();
        rifles_data = new ArrayList<weapon>();

        try (connection;
             Statement statement  = connection.createStatement();
             ResultSet result_set    = statement.executeQuery(sql)){
            while (result_set.next()) {

                String category = result_set.getString("CATEGORY");
                String name = result_set.getString("NAME");
                int magazine_capacity = result_set.getInt("MAGAZINE_CAPACITY");
                int total_magazine_capacity = result_set.getInt("TOTAL_MAGAZINE_CAPACITY");
                int damage = result_set.getInt("DAMAGE");
                int range_of_fire = result_set.getInt("RANGE_OF_FIRE");
                int wait_after_shot = result_set.getInt("WAIT_AFTER_SHOT");
                int reload_time = result_set.getInt("RELOAD_TIME");
                int fire_mode = result_set.getInt("FIRE_MODE");
                String weapon_image = result_set.getString("WEAPON_IMAGE");

                weapon weapon = new weapon(category, name, new int[]{magazine_capacity, total_magazine_capacity}, damage, range_of_fire, wait_after_shot, reload_time, fire_mode, weapon_image, "null");
                write_weapons_data_from_db<String, weapon> weapon_object;

                if (category.compareTo("pistol") == 0) {
                    weapon_object =  new write_weapons_data_from_db<String, weapon>("pistol", weapon);
                }

                if (category.compareTo("smg") == 0) {
                    weapon_object =  new write_weapons_data_from_db<String, weapon>("smg", weapon);
                }

                if (category.compareTo("rifle") == 0) {
                    weapon_object = new write_weapons_data_from_db<String, weapon>("rifle", weapon);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<weapon> getPistols_data() {
        return pistols_data;
    }

    public static ArrayList<weapon> getSmgs_data() {
        return smgs_data;
    }

    public static ArrayList<weapon> getRifles_data() {
        return rifles_data;
    }

    public static void setPistols_data(weapon weapon_object) {
        weapon_data.pistols_data.add(weapon_object);
    }

    public static void setSmgs_data(weapon weapon_object) {
        weapon_data.smgs_data.add(weapon_object);
    }

    public static void setRifles_data(weapon weapon_object) {
        weapon_data.rifles_data.add(weapon_object);
    }
}
