package com.inventory.app_game.game_data;

import com.inventory.app_components.app_weapons.weapon;

import java.util.ArrayList;

public class game_data {

    private static game_data game_data;

    private ArrayList<weapon> inventory = new ArrayList<>();


    private game_data(weapon pistol_data, weapon smg_data, weapon rifle_data) {
        this.inventory.add(pistol_data);
        this.inventory.add(smg_data);
        this.inventory.add(rifle_data);
    }

    public static void create_soldier(weapon pistol_data, weapon smg_data, weapon rifle_data) {
        game_data = new game_data(pistol_data, smg_data, rifle_data);
    }

    public static game_data get_soldier() {
        return game_data;
    }

    public ArrayList<weapon> getInventory() {
        return inventory;
    }
}
