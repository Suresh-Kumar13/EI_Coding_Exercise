package com.smarthome.devices;

public class Light extends SmartDevice {
    public Light(int id) {
        super(id);
    }

    @Override
    public void turnOn() { status = "on"; }

    @Override
    public void turnOff() { status = "off"; }

    @Override
    public String getStatus() { return "Light " + id + " is " + status; }
}
