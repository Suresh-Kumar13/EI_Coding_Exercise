package com.smarthome.proxy;

import com.smarthome.devices.SmartDevice;
import com.smarthome.devices.Thermostat;
import com.smarthome.util.LoggerUtil;

public class DeviceProxy extends SmartDevice {
    private final SmartDevice realDevice;

    public DeviceProxy(SmartDevice realDevice) {
        super(realDevice.getId());
        this.realDevice = realDevice;
    }

    @Override
    public void turnOn() {
        LoggerUtil.log("Proxy: Checking before turning ON device " + realDevice.getId());
        // Example: restrict thermostat too high temp
        if (realDevice instanceof Thermostat) {
            Thermostat t = (Thermostat) realDevice;
            if (t.getTemperature() > 35) {
                LoggerUtil.log("Proxy: Cannot activate thermostat above 35°C");
                return;
            }
        }
        realDevice.turnOn();
    }

    @Override
    public void turnOff() {
        LoggerUtil.log("Proxy: Checking before turning OFF device " + realDevice.getId());
        realDevice.turnOff();
    }

    @Override
    public String getStatus() {
        return "Proxy Access -> " + realDevice.getStatus();
    }

    public SmartDevice getRealDevice() {
        return realDevice;
    }
}
