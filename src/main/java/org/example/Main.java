package org.example;

public class Main {
    public static void main(String[] args) {
        Robot goodRobot = new Robot("Rob", "attack");

        goodRobot.powerOn();
        goodRobot.performTask("Clean the room");

        Robot evilCLone = goodRobot.createClone();
        System.out.println(goodRobot.equals(evilCLone));
        evilCLone.performTask("Destroy the world");

        System.out.println(goodRobot.doTask());

    }
}