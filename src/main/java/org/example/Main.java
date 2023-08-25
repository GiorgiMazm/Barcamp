package org.example;

public class Main {
    public static void main(String[] args) {
        Robot t12 = new Robot("Rob", "attack");

        t12.setPoweredOn(true);
        t12.performTask("Clean the room");
        System.out.println(t12.doTask());
    }
}