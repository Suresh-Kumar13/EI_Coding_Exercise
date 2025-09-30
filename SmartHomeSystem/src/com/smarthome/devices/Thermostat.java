package com.smarthome.devices;

public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(int id, int temp) {
        super(id);
        this.temperature = temp;
        this.status = "set to " + temp + " degrees";
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        this.status = "set to " + temp + " degrees";
    }

    @Override
    public void turnOn() { status = "active at " + temperature + " degrees"; }

    @Override
    public void turnOff() { status = "off"; }

    @Override
    public String getStatus() { return "Thermostat " + id + " " + status; }

    public int getTemperature() { return temperature; }
}
