package com.example.demo.model;

import java.util.List;

public class Room {

    List<SmartDevice> smartDevices;

    public Room(List<SmartDevice> smartDevices) {
        this.smartDevices = smartDevices;
    }

    public List<SmartDevice> getSmartDevices() {
        return smartDevices;
    }

    public void setSmartDevices(List<SmartDevice> smartDevices) {
        this.smartDevices = smartDevices;
    }
}
