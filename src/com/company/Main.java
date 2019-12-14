package com.company;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room("White", 2.5, 10);
        System.out.println(room1.CalculateCubicValue());

        Kitchen kitchen1 = new Kitchen("Green", 2.5,8, 2);
        System.out.println(kitchen1.CalculateCubicValue());

        Room room2 = new Kitchen("White", 2.5, 10, 1);

        Object room3 = new Kitchen("White", 2.5, 10, 1);
    }
}
