package com.smarthome.devices;

public class DoorLock extends SmartDevice {
    public DoorLock(int id) {
        super(id);
        this.status = "locked";
    }

    @Override
    public void turnOn() { status = "unlocked"; }

    @Override
    public void turnOff() { status = "locked"; }

    @Override
    public String getStatus() { return "Door " + id + " is " + status; }
}
