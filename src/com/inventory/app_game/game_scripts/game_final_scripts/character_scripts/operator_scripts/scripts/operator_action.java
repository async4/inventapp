package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_scripts.scripts;

import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;

public abstract class operator_action {

    public static void fire() {
        operator.current_weapon.magazine_capacity--;
        operator.waiting = true;
    }

    public static void reload() {
        // OPTIMIZE EDILECEK
        operator.current_weapon.magazine_capacity = operator.current_weapon.save_magazine_capacity;
        operator.current_weapon.total_magazine_capacity -= operator.current_weapon.magazine_capacity;
        // OPTIMIZE EDILECEK

        operator.reloading = false;
    }
}
