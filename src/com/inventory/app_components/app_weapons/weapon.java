package com.inventory.app_components.app_weapons;


public class weapon {
    // db data
    private final String name;
    private final String category;
    private final int[] magazine_capacity;
    private final int damage;
    private final int range_of_fire;
    private final int wait_after_shot;
    private final int reload_time;
    private final int fire_mode;
    private final String weapon_default_image;
    private final String weapon_default_ico;
    private final String weapon_hoverable_ico;

    // class property
    private boolean weapon_choice_status;


    public weapon(String category, String name, int[] magazine_capacity, int damage, int range_of_fire, int wait_after_shot, int reload_time, int fire_mode, String weapon_default_image, String weapon_default_ico, String weapon_hoverable_ico) {
        this.category = category;
        this.name = name;
        this.magazine_capacity = magazine_capacity;
        this.damage = damage;
        this.range_of_fire = range_of_fire;
        this.wait_after_shot = wait_after_shot;
        this.reload_time = reload_time;
        this.fire_mode = fire_mode;
        this.weapon_default_image = weapon_default_image;
        this.weapon_default_ico = weapon_default_ico;
        this.weapon_hoverable_ico = weapon_hoverable_ico;

        this.weapon_choice_status = false;
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


    public String getWeapon_default_ico() {
        return weapon_default_ico;
    }


    public String getWeapon_hoverable_ico() {
        return weapon_hoverable_ico;
    }


    public boolean getWeapon_choice_status() {
        return this.weapon_choice_status;
    }


    public void setWeapon_choice_status(boolean status) {
        if (this.weapon_choice_status == status) {
            this.weapon_choice_status = !status;
        } else {
            this.weapon_choice_status = status;
        }
    }
}