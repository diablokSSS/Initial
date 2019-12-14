package com.company;

public class Kitchen extends Room{
    private int numberOfTables;

    public Kitchen(String color, double height, double area, int numberOfTables) {
        super(color, height, area);
        this.numberOfTables = numberOfTables;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }


    }

