package be.techfix.observer.basicpattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
public class WeatherData implements Subject {
    private Float temperature;
    private Float humidity;
    private Float pressure;
    private List<Displayer> displayerList;

    public WeatherData() {
        this.displayerList = new ArrayList<>();
    }

    public void updateWeatherData(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(Displayer o) {
        this.displayerList.add(o);
    }

    @Override
    public void removeObserver(Displayer o) {
        this.displayerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Displayer observer : displayerList) {
            observer.update(this);
        }
    }
}
