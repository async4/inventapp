package com.inventory.app_game.game_common.game_object;


public abstract class game_object implements general_scripts {

    protected object_tag tag;
    protected double position_x;
    protected double position_y;

    protected double mouse_x;
    protected double mouse_y;


    public game_object(object_tag tag, double position_x, double position_y) {
        this.tag = tag;
        this.position_x = position_x;
        this.position_y = position_y;
    }


    public object_tag getTag() {
        return tag;
    }


    public double getPosition_x() {
        return position_x;
    }


    public double getPosition_y() {
        return position_y;
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