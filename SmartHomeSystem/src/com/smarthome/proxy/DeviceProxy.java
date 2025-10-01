package com.smarthome.proxy;

import com.smarthome.devices.SmartDevice;

public class DeviceProxy extends SmartDevice {
    private final SmartDevice realDevice;

    public DeviceProxy(SmartDevice realDevice) {
        super(realDevice.getId());
        this.realDevice = realDevice;
    }

    @Override
    public void turnOn() {
        realDevice.turnOn();
    }

    @Override
    public void turnOff() {
        realDevice.turnOff();
    }

    @Override
    public String getStatus() {
        return realDevice.getStatus();
    }
}
