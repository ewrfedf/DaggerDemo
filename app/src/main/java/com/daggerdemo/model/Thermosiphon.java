package com.daggerdemo.model;

/**
 * Created by Zheng on 15/9/28.
 */

import javax.inject.Inject;

class Thermosiphon implements Pump {
    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
