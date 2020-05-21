package com.inventory.app_game.game_common.game_object;


import java.awt.*;

public abstract class game_object {
    protected object_tag tag;
    protected int position_x;
    protected int position_y;

    protected double mouse_x;
    protected double mouse_y;

    public game_object(object_tag tag, int position_x, int position_y, double angle) {
        this.tag = tag;
        this.position_x = position_x;
        this.position_y = position_y;
    }

    public abstract void update();
    public abstract void render(Graphics g);

    public object_tag getTag() {
        return tag;
    }

    public int getPosition_x() {
        return position_x;
    }

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public int getPosition_y() {
        return position_y;
    }

    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }

    public double getMouse_x() {
        return mouse_x;
    }

    public void setMouse_x(double mouse_x) {
        this.mouse_x = mouse_x;
    }

    public double getMouse_y() {
        return mouse_y;
    }

    public void setMouse_y(double mouse_y) {
        this.mouse_y = mouse_y;
    }
}
