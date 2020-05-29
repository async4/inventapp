package com.inventory.app_game.game_common.game_target_spawner;

import com.inventory.app_game.game_common.game_handler.game_handler;
import com.inventory.app_game.game_common.game_object.object_tag;
import com.inventory.app_game.game_final.game_content.game_components.game_character.target.target;
import com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.target_scripts.scripts.random_location;

import java.util.ArrayList;


public abstract class target_spawner {

    public static void spawn(game_handler handler) {
        ArrayList<Double> location = random_location.generate_random_location();
        handler.add_object(new target(object_tag.target, location.get(0), location.get(1)));
    }

}
