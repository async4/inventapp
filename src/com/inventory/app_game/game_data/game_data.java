package com.inventory.app_game.game_data;

import com.inventory.app_components.app_weapons.weapon;
import com.inventory.app_game.game_data.test.test;

import java.util.ArrayList;


public class game_data {
    public static ArrayList<weapon> wp;

    public static ArrayList<test> weapons;


    public game_data(weapon pistol_data, weapon smg_data, weapon rifle_data) {
        wp = new ArrayList<>();

        wp.add(pistol_data);
        wp.add(smg_data);
        wp.add(rifle_data);

        weapons = new ArrayList<test>();;


        for (var item: wp
        ) {
            weapons.add(new test(item.getName(), item.getMagazine_capacity()[0], item.getMagazine_capacity()[1]));
        }

    }
}
