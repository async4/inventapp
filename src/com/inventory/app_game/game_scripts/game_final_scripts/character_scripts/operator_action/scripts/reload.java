package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.operator_action.scripts;

import com.inventory.app_game.game_final.game_content.game_components.game_character.operator.operator;

public abstract class reload {

    public static void reloading() {
        operator.current_weapon.total_magazine_capacity -= (operator.current_weapon.save_magazine_capacity - operator.current_weapon.magazine_capacity);
        operator.current_weapon.magazine_capacity = operator.current_weapon.save_magazine_capacity;
    }

}

