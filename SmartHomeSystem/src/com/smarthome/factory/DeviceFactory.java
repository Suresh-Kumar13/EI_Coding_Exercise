package com.smarthome.factory;

import com.smarthome.devices.*;
import com.smarthome.exception.InvalidInputException;

public class DeviceFactory {
    public static SmartDevice createDevice(String type, int id) throws InvalidInputException {
        switch (type.toLowerCase()) {
            case "light": return new Light(id);
            case "thermostat": return new Thermostat(id, 70);
            case "door": return new DoorLock(id);
            default: throw new InvalidInputException("Unknown device type: " + type);
        }
    }
}
