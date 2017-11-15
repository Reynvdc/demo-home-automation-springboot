package com.example.demo.model.devices;

import com.example.demo.model.SmartDevice;

public class LightBulb implements SmartDevice{

    private boolean lightOn;

    public boolean toggleLight(){
        return lightOn = !lightOn;
    }

    @Override
    public void doAction() {
        toggleLight();
    }

    @Override
    public boolean isActive() {
        return lightOn;
    }

    public boolean isLightOn() {
        return lightOn;
    }

    public void setLightOn(boolean lightOn) {
        this.lightOn = lightOn;
    }
}
