package be.techfix.observer.flow;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import java.util.concurrent.SubmissionPublisher;


@Getter
@Log
public class WeatherDataProvider {
    private final SubmissionPublisher<Weather> publisher;


    public WeatherDataProvider() {
        this.publisher = new SubmissionPublisher<>();
    }

    public void updateWeatherData(Float temperature, Float humidity, Float pressure) {

        publisher.submit(Weather.builder().temperature(temperature).humidity(humidity).pressure(pressure).build());
    }


    @Getter
    @Setter
    @Builder
    public static class Weather {
        private Float temperature;
        private Float humidity;
        private Float pressure;
    }
}
