package com.invent.app_dal.get_weapon_data;

import com.invent.app_components.app_weapons.weapon;
import com.invent.app_components.app_weapons.weapon_pistols.weapon_pistol;
import com.invent.app_components.app_weapons.weapon_rifles.weapon_rifle;
import com.invent.app_components.app_weapons.weapon_smgs.weapon_smg;

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

                if (category.compareTo("pistol") == 0) {
                    weapon_data.pistols_data.add(
                            new weapon_pistol(category, name, new int[]{magazine_capacity, total_magazine_capacity},
                                    damage, range_of_fire, wait_after_shot,
                                    reload_time, fire_mode, "null", "null"));
                }

                if (category.compareTo("smg") == 0) {
                    weapon_data.smgs_data.add(
                            new weapon_smg(category, name, new int[]{magazine_capacity, total_magazine_capacity},
                                           damage, range_of_fire, wait_after_shot,
                                           reload_time, fire_mode, "null", "null"));
                }

                if (category.compareTo("rifle") == 0) {
                    weapon_data.rifles_data.add(
                            new weapon_rifle(category, name, new int[]{magazine_capacity, total_magazine_capacity},
                                             damage, range_of_fire, wait_after_shot,
                                             reload_time, fire_mode, "null", "null"));
                }
            }
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
}
