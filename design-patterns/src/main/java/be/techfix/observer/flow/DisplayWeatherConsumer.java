package be.techfix.observer.flow;


import be.techfix.observer.common.Display;
import be.techfix.observer.flow.WeatherDataProvider.Weather;
import lombok.extern.java.Log;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;

@Log
public class DisplayWeatherConsumer implements Flow.Subscriber<Weather> {

    final Display display;
    private Subscription subscription;

    public DisplayWeatherConsumer(Display display) {
        this.display = display;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Weather item) {
        display.displayHumidity(item.getHumidity());
        display.displayTemperature(item.getTemperature());
        display.displayPressure(item.getPressure());
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}
