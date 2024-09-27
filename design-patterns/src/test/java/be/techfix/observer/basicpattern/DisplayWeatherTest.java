package be.techfix.observer.basicpattern;


import be.techfix.observer.common.LCDDisplay;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class DisplayWeatherTest {

    @Mock
    LCDDisplay lcdDisplay;

    @Test
    void should_display_weather_data_when_received() {
        DisplayWeather displayWeather = new DisplayWeather(lcdDisplay);
        WeatherData weatherData = new WeatherData();
        weatherData.setHumidity(Float.MIN_NORMAL);
        weatherData.setPressure(Float.MAX_VALUE);
        weatherData.setTemperature(Float.MAX_VALUE);
        displayWeather.display(weatherData);

        Mockito.verify(lcdDisplay).displayHumidity(Float.MIN_NORMAL);
        Mockito.verify(lcdDisplay).displayPressure(Float.MAX_VALUE);
        Mockito.verify(lcdDisplay).displayTemperature(Float.MAX_VALUE);
    }

}