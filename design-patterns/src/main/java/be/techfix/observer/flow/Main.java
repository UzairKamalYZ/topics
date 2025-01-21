package be.techfix.observer.flow;

import be.techfix.observer.common.DummyDisplay;
import be.techfix.observer.common.LCDDisplay;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        WeatherDataProvider weatherData = new WeatherDataProvider();
        DisplayWeatherConsumer lcdDisplay = new DisplayWeatherConsumer(new LCDDisplay());
        weatherData.getPublisher().subscribe(lcdDisplay);

        DisplayWeatherConsumer anyDummyDisplay = new DisplayWeatherConsumer(new DummyDisplay());
        weatherData.getPublisher().subscribe(anyDummyDisplay);

        for (int i = 0; i < 10; i++) {
            weatherData.updateWeatherData(ThreadLocalRandom.current().nextFloat(32,100),
                    ThreadLocalRandom.current().nextFloat(50,100),
                    ThreadLocalRandom.current().nextFloat(30,100));
        }


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}