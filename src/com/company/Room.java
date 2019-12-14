package com.company;

public class Room {
    protected String color;
    private double height;
    private double area;


    public Room(String color, double height, double area) {
        this.color = color;
        this.height = height;
        this.area = area;

    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getColor() {
        return this.color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double CalculateCubicValue(){

        return height * area;

    }

}

