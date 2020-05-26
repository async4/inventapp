package com.inventory.app_game.game_common.game_object;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public interface general_scripts {
    void update();
    void render(Graphics g);
    Rectangle get_bounds();

}
