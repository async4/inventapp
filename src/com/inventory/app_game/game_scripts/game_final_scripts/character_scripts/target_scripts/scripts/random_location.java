package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.target_scripts.scripts;

import java.util.ArrayList;
import java.util.Random;

public abstract class random_location {

    private static final int MAX_WIDTH = 800;
    private static final int MIN_WIDTH = 20;

    private static final int MAX_HEIGHT = 500;
    private static final int MIN_HEIGHT = 20;

    private static ArrayList<Integer> location;

    public static ArrayList<Integer> generate_random_location() {
        Random rand = new Random();
        location = new ArrayList<>();

        int x_loc = rand.nextInt((MAX_WIDTH - MIN_WIDTH)) + MIN_WIDTH;
        int y_loc = rand.nextInt((MAX_HEIGHT - MIN_HEIGHT)) + MIN_HEIGHT;

        location.add(x_loc);
        location.add(y_loc);

        return location;

    }
}
