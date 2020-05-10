package com.invent.app_components.app_weapons.weapon_pistols;

import com.invent.app_business.weapon_actions.IWeapon_Action;
import com.invent.app_components.app_weapons.weapon;

public class weapon_pistol extends weapon implements IWeapon_Action {
    public weapon_pistol(String category, String name, int[] magazine_capacity, int damage, int range_of_fire, int wait_after_shot, int reload_time, int fire_mode) {
        super(category, name, magazine_capacity, damage, range_of_fire, wait_after_shot, reload_time, fire_mode);
    }

    @Override
    public void fire() {

    }

    @Override
    public void reloading() {

    }

    @Override
    public void waiting_after_shot() {

    }
}
