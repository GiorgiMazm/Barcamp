package org.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot implements Prototype<Robot> {
    private final int maxBatteryLevel = 100;
    private String name;
    private final String type;
    private int batteryLevel = maxBatteryLevel;
    private boolean isPoweredOn = false;

    private List<String> tasks = new ArrayList<>();

    public void powerOn() {
        isPoweredOn = true;
    }

    public String doTask() {
        int taskBatteryCost = 10;

        if (this.tasks.isEmpty()) return "There is no task to do";
        if (this.batteryLevel < taskBatteryCost) return "There is not enough battery level to do this task";
        if (!this.isPoweredOn) return "Robot must be on to do a task";
        this.batteryLevel -= taskBatteryCost;

        String task = this.tasks.get(tasks.size() - 1);
        this.tasks.remove(task);
        return "Task " + task + " was successfully done";
    }

    public Robot(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }


    public int getBatteryLevel() {
        return batteryLevel;
    }


    public boolean isPoweredOn() {
        return isPoweredOn;
    }


    public List<String> getTasks() {
        return tasks;
    }

    public void powerOff() {
        isPoweredOn = false;
    }

    public void chargeBattery() {
        this.batteryLevel = maxBatteryLevel;
    }

    public void performTask(String task) {
        this.tasks.add(task);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Robot otherRobot = (Robot) other;
        return name.equals(otherRobot.name) &&
                type.equals(otherRobot.type) &&
                batteryLevel == otherRobot.batteryLevel &&
                isPoweredOn == otherRobot.isPoweredOn &&
                tasks.equals(otherRobot.tasks); // Compare the tasks' contents
    }


    @Override
    public Robot createClone() {
        Robot clone = new Robot(this.name, this.type);
        clone.isPoweredOn = this.isPoweredOn;
        clone.batteryLevel = this.batteryLevel;
        clone.tasks = new ArrayList<>(this.getTasks());
        return clone;
    }
}
