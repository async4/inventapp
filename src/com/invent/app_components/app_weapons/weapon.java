package com.invent.app_components.app_weapons;

public class weapon {
    private String name;
    private String category;
    private int[] magazine_capacity;
    private int damage;
    private int range_of_fire;
    private int wait_after_shot;
    private int reload_time;
    private int fire_mode;
    private String weapon_default_image;
    private String weapon_hoverable_image;

    public weapon() {

    }

    public weapon(String category, String name, int[] magazine_capacity, int damage, int range_of_fire, int wait_after_shot, int reload_time, int fire_mode, String weapon_default_image, String weapon_hoverable_image) {
        this.category = category;
        this.name = name;
        this.magazine_capacity = magazine_capacity;
        this.damage = damage;
        this.range_of_fire = range_of_fire;
        this.wait_after_shot = wait_after_shot;
        this.reload_time = reload_time;
        this.fire_mode = fire_mode;
        this.weapon_default_image = weapon_default_image;
        this.weapon_hoverable_image = weapon_hoverable_image;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int[] getMagazine_capacity() {
        return magazine_capacity;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange_of_fire() {
        return range_of_fire;
    }

    public int getWait_after_shot() {
        return wait_after_shot;
    }

    public int getReload_time() {
        return reload_time;
    }

    public int getFire_mode() {
        return fire_mode;
    }

    public String getWeapon_default_image() {
        return weapon_default_image;
    }

    public String getWeapon_hoverable_image() {
        return weapon_hoverable_image;
    }

}
