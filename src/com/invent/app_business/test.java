package com.invent.app_business;

import com.invent.app_business.weapon_pane_actions.weapon_data;
import com.invent.app_components.app_weapons.weapon;

import java.util.ArrayList;

public class test {
    public static ArrayList<weapon> pistols;

    public static void set_pistols() {
        pistols = new ArrayList<weapon>();

        pistols.add(new weapon("pistol", "glock", new int[]{12, 24},
                                30, 50, 1,
                                2, 0, "null", "null"));

        pistols.add(new weapon("pistol", "deagle", new int[]{9, 50},
                                230, 80, 1,
                                3, 0, "null", "null"));

        pistols.add(new weapon("pistol", "tec-9", new int[]{12, 46},
                                80, 70, 1,
                                3, 0, "null", "null"));

        pistols.add(new weapon("pistol", "usp-s", new int[]{12, 24},
                                30, 50, 1,
                                2, 0, "null", "null"));

        pistols.add(new weapon("pistol", "p250", new int[]{12, 24},
                                29, 70, 1,
                                2, 0, "null", "null"));

        // ################################################
        weapon_data.pull_weapon_data();

        // ################################################
    }

    public static ArrayList<weapon> get_pistols() {
        return pistols;
    }

}
