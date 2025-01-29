package org.humber.week4;


public class Shape {

    public static String DEFAULT_COLOR = "white";
    private String color;

    public Shape() {
        this.color = DEFAULT_COLOR;
    }

    public Shape(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
