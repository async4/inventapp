package com.inventory.app_game.game_scripts.game_final_scripts.character_scripts.target_scripts.scripts;

import java.util.ArrayList;
import java.util.Random;

public abstract class random_location {

    private static final double MAX_WIDTH = 700.0;
    private static final double MAX_HEIGHT = 450.0;

    private static ArrayList<Double> location;

    public static ArrayList<Double> generate_random_location() {
        Random rand = new Random();
        location = new ArrayList<>();

        double x_loc = rand.nextDouble() * MAX_WIDTH;
        double y_loc = rand.nextDouble() * MAX_HEIGHT;

        location.add(x_loc);
        location.add(y_loc);

        return location;

    }
}
