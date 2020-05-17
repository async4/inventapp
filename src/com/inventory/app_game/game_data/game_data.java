package com.inventory.app_game.game_data;

import com.inventory.app_components.app_weapons.weapon;


public class game_data {
    private static game_data game_data;

    private final weapon pistol_data;
    private final weapon smg_data;
    private final weapon rifle_data;


    private game_data(weapon pistol_data, weapon smg_data, weapon rifle_data) {
        this.pistol_data = pistol_data;
        this.smg_data = smg_data;
        this.rifle_data = rifle_data;
    }


    public static void set_game_data(weapon pistol_data, weapon smg_data, weapon rifle_data) {
        game_data = new game_data(pistol_data, smg_data, rifle_data);
    }


    public weapon get_pistol_data() {
        return pistol_data;
    }


    public weapon get_smg_data() {
        return smg_data;
    }


    public weapon get_rifle_data() {
        return rifle_data;
    }


    public static game_data get_game_data() {
        return game_data;
    }
}
