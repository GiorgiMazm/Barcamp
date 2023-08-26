package org.example;

public class Main {
    public static void main(String[] args) {
        Robot t12 = new Robot("Rob", "attack");

        t12.setPoweredOn(true);
        t12.performTask("Clean the room");

        Robot evilCLone = t12.createClone();
        evilCLone.performTask("Destroy the world");

        System.out.println(t12.doTask());
        System.out.println(evilCLone.getBatteryLevel());
    }
}