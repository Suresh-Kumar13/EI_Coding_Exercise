package com.smarthome.hub;

import com.smarthome.devices.SmartDevice;
import com.smarthome.exception.DeviceNotFoundException;
import com.smarthome.exception.InvalidActionException;
import com.smarthome.util.LoggerUtil;

import java.util.*;

public class SmartHomeHub {
    private List<SmartDevice> devices = new ArrayList<>();
    private List<Trigger> triggers = new ArrayList<>();
    private Scheduler scheduler = new Scheduler();

    public SmartHomeHub() {
        scheduler.runScheduler(this);
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
        LoggerUtil.log("Device added: " + device.getStatus());
    }

    public void removeDevice(int id) throws DeviceNotFoundException {
        boolean removed = devices.removeIf(d -> d.getId() == id);
        if (!removed) throw new DeviceNotFoundException("Device " + id + " not found for removal.");
        LoggerUtil.log("Device " + id + " removed.");
    }

    public void controlDevice(int id, String action) throws DeviceNotFoundException, InvalidActionException {
        for (SmartDevice d : devices) {
            if (d.getId() == id) {
                if (action.equalsIgnoreCase("on")) d.turnOn();
                else if (action.equalsIgnoreCase("off")) d.turnOff();
                else throw new InvalidActionException("Invalid action: " + action);
                LoggerUtil.log("Action applied: " + d.getStatus());
                checkTriggers();
                return;
            }
        }
        throw new DeviceNotFoundException("Device " + id + " not found.");
    }

    public void showStatus() {
        if (devices.isEmpty()) {
            System.out.println("No devices added yet.");
            return;
        }
        for (SmartDevice d : devices) {
            System.out.println(d.getStatus());
        }
    }

    public void addTrigger(Trigger trigger) {
        triggers.add(trigger);
        LoggerUtil.log("Trigger added: " + trigger.getDescription());
    }

    private void checkTriggers() {
        for (Trigger t : triggers) {
            t.evaluate(devices, this);
        }
    }

    public void scheduleDeviceAction(int id, String time, String action) {
        try {
            scheduler.addTask(id, time, action);
        } catch (Exception e) {
            System.out.println("Scheduling Error: " + e.getMessage());
        }
    }

    // New: show all scheduled tasks
    public void showScheduledTasks() {
        List<Scheduler.ScheduledTask> scheduledTasks = scheduler.getScheduledTasks();
        if (scheduledTasks.isEmpty()) {
            System.out.println("No scheduled tasks.");
        } else {
            System.out.println("Scheduled Tasks:");
            for (Scheduler.ScheduledTask task : scheduledTasks) {
                System.out.println(task);
            }
        }
    }

    // New: show all triggers
    public void showTriggers() {
        if (triggers.isEmpty()) {
            System.out.println("No triggers added.");
        } else {
            System.out.println("Automation Triggers:");
            for (Trigger t : triggers) {
                System.out.println(t.getDescription());
            }
        }
    }
}
