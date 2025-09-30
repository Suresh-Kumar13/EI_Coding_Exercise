package com.smarthome.hub;

import com.smarthome.devices.SmartDevice;
import com.smarthome.devices.Thermostat;
import com.smarthome.exception.InvalidInputException;

import java.util.List;

public class Trigger {
    private String description;
    private int threshold;
    private int deviceId;
    private String action;

    public Trigger(String description, int threshold, int deviceId, String action) throws InvalidInputException {
        if (threshold < 0) {
            throw new InvalidInputException("Thermostat threshold cannot be negative.");
        }
        if (!(action.equalsIgnoreCase("on") || action.equalsIgnoreCase("off"))) {
            throw new InvalidInputException("Invalid action for trigger: " + action);
        }
        this.description = description;
        this.threshold = threshold;
        this.deviceId = deviceId;
        this.action = action;
    }

    public String getDescription() { return description; }

    // Observer evaluation
    public void evaluate(List<SmartDevice> devices, SmartHomeHub hub) {
        for (SmartDevice d : devices) {
            if (d instanceof Thermostat) {
                Thermostat t = (Thermostat) d;
                if (t.getTemperature() > threshold) {
                    try {
                        hub.controlDevice(deviceId, action);
                    } catch (Exception e) {
                        System.out.println("Trigger failed: " + e.getMessage());
                    }
                }
            }
        }
    }
}
