package com.inventory.app_game.game_data.selected_weapon;

public class selected_weapon {

    public String category;
    public String name;
    public int magazine_capacity;
    public int total_magazine_capacity;
    public int damage;
    public int range_of_fire;
    public int wait_after_shot;
    public int reload_time;
    public int fire_mode;

    public final int save_magazine_capacity, save_total_magazine_capacity;


    public selected_weapon(String category, String name, int[] magazine_capacity, int damage, int range_of_fire, int wait_after_shot, int reload_time, int fire_mode) {
        this.category = category;
        this.name = name;
        this.magazine_capacity = magazine_capacity[0];
        this.total_magazine_capacity = magazine_capacity[1];
        this.damage = damage;
        this.range_of_fire = range_of_fire;
        this.wait_after_shot = wait_after_shot;
        this.reload_time = reload_time;
        this.fire_mode = fire_mode;

        this.save_magazine_capacity = this.magazine_capacity;
        this.save_total_magazine_capacity = this.total_magazine_capacity;
    }
}
