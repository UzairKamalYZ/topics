package be.techfix.observer.common;

import lombok.extern.java.Log;

@Log
public class DummyDisplay implements Display {
    @Override
    public void displayTemperature(Float temperature) {
        log.info("Display temperature -> " + temperature);
    }

    @Override
    public void displayHumidity(Float humidity) {
        log.info("Display humidity -> " + humidity);
    }

    @Override
    public void displayPressure(Float pressure) {
        log.info("Display pressure -> " + pressure);
    }
}
