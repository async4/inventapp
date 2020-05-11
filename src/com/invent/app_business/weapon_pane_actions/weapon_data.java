package com.invent.app_business.weapon_pane_actions;

import com.invent.app_components.app_weapons.weapon;
import com.invent.app_dal.get_weapon_data.get_data;

import java.util.ArrayList;

public class weapon_data {
    private static ArrayList<weapon> pistols_data;
    private static ArrayList<weapon> smgs_data;
    private static ArrayList<weapon> rifles_data;

    public static void pull_weapon_data() {
        get_data.connect();


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
