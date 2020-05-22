package com.inventory.app_game.game_data.test;

public class test {

    public String name;
    public int mag_cap;
    public int tot_mag_cap;

    public test(String name, int mag_cap, int tot_mag_cap) {
        this.name = name;
        this.mag_cap = mag_cap;
        this.tot_mag_cap = tot_mag_cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
