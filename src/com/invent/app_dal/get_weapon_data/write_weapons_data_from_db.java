package com.invent.app_dal.get_weapon_data;

import com.invent.app_components.app_weapons.weapon;

public class write_weapons_data_from_db<V, T> {

    public write_weapons_data_from_db(V category_name, T weapon_object) {
        if (category_name.toString().compareTo("pistol") == 0) {
            weapon_data.setPistols_data((weapon) weapon_object);
        }

        if (category_name.toString().compareTo("smg") == 0) {
            weapon_data.setSmgs_data((weapon) weapon_object);
        }

        if (category_name.toString().compareTo("rifle") == 0) {
            weapon_data.setRifles_data((weapon) weapon_object);
        }

    }
}
