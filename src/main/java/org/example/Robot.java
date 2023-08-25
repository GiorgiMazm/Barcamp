package org.example;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private String name;
    private String type;
    private int batteryLevel = 100;
    private boolean isPoweredOn = false;
    private final List<String> tasks = new ArrayList<>();

    public void powerOn() {
        isPoweredOn = true;
    }

    public String doTask() {
        if (this.tasks.isEmpty()) return "There is no task to do";
        if (this.batteryLevel < 10) return "There is not enough battery level to do this task";
        if (!this.isPoweredOn) return "Robot must be on to do a task";
        this.batteryLevel -= 10;
        return "Task " + this.tasks.get(0) + " was successfully done";
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

    public void setType(String type) {
        this.type = type;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isPoweredOn() {
        return isPoweredOn;
    }

    public void setPoweredOn(boolean poweredOn) {
        isPoweredOn = poweredOn;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void powerOff() {
        isPoweredOn = false;
    }

    public void chargeBattery() {
        this.batteryLevel = 100;
    }

    public void performTask(String task) {
        this.tasks.add(task);
    }
}
