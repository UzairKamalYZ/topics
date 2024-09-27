package be.techfix.observer.basicpattern;


import be.techfix.observer.common.Display;
import lombok.extern.java.Log;

@Log
public class DisplayWeather implements Displayer {

    final Display display;

    public DisplayWeather(Display display) {
        this.display = display;
    }

    public void display(WeatherData data) {
        display.displayHumidity(data.getHumidity());
        display.displayTemperature(data.getTemperature());
        display.displayPressure(data.getPressure());
    }

    @Override
    public void update(WeatherData weatherData) {
        this.display(weatherData);
    }
}
