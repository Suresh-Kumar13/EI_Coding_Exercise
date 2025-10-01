package com.smarthome.hub;

import com.smarthome.exception.InvalidInputException;
import com.smarthome.util.LoggerUtil;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Scheduler {
    private List<ScheduledTask> tasks = new ArrayList<>();

    public void addTask(int deviceId, String timeStr, String action) throws InvalidInputException {
        try {
            LocalTime time = LocalTime.parse(timeStr); 
            if (!(action.equalsIgnoreCase("on") || action.equalsIgnoreCase("off"))) {
                throw new InvalidInputException("Invalid action for scheduling: " + action);
            }
            tasks.add(new ScheduledTask(deviceId, time, action));
            LoggerUtil.log("Scheduled: Device " + deviceId + " -> " + action + " at " + time);
        } catch (DateTimeParseException e) {
            throw new InvalidInputException("Invalid time format. Please use HH:MM (e.g., 08:30).");
        }
    }

    public void checkAndRunTasks(SmartHomeHub hub) {
    LocalTime now = LocalTime.now().withSecond(0).withNano(0);
    Iterator<ScheduledTask> iterator = tasks.iterator();

    while (iterator.hasNext()) {
        ScheduledTask task = iterator.next();

        if (!task.time.isAfter(now)) {
            try {
                hub.controlDevice(task.deviceId, task.action);
                LoggerUtil.log("Executed scheduled task: " + task);
            } catch (Exception e) {
                LoggerUtil.log("Scheduler Error: " + e.getMessage());
            }
            iterator.remove(); 
        }
    }
}



    public List<ScheduledTask> getScheduledTasks() {
        return new ArrayList<>(tasks);
    }

  
    public static class ScheduledTask {
        int deviceId;
        LocalTime time;
        String action;

        ScheduledTask(int id, LocalTime t, String action) {
            this.deviceId = id;
            this.time = t;
            this.action = action;
        }

        @Override
        public String toString() {
            return "Device " + deviceId + " -> " + action.toUpperCase() + " at " + time;
        }
    }
}
