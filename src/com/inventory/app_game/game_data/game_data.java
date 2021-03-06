package com.inventory.app_game.game_data;

import com.inventory.app_common.weapon;
import com.inventory.app_game.game_data.selected_weapon.selected_weapon;

import java.util.ArrayList;


public class game_data {
    public static ArrayList<weapon> wp;

    public static ArrayList<selected_weapon> weapons;

    /* silah verilerini veritabanindan cektikten sonra bir arrayliste aktariyoruz ve o arraylist tum
       programda kullanilabilir bir arraylist oluyor yani static oluyor.

       Oyun icinde mermi kapasitesinin azalacagini dusundugumuzde azalan mermi verisi
       genel programi etkilememesi icin ayri bir silah verisi class i olusturuyoruz.
     */
    public game_data(weapon pistol_data, weapon smg_data, weapon rifle_data) {
        wp = new ArrayList<>();

        wp.add(pistol_data);
        wp.add(smg_data);
        wp.add(rifle_data);

        weapons = new ArrayList<>();;

        for (var item: wp
        ) {
            weapons.add(
                new selected_weapon(
                    item.getCategory(),
                    item.getName(),
                    item.getMagazine_capacity(),
                    item.getDamage(),
                    item.getRange_of_fire(),
                    item.getWait_after_shot(),
                    item.getReload_time(),
                    item.getFire_mode())
            );
        }

    }
}
