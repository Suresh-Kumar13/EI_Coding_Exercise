// WeatherStation.java

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private String condition;
    private final List<WeatherObserver> observers = new ArrayList<>();

    public void attach(WeatherObserver observer) {
        observers.add(observer);
    }

    public void detach(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void setCondition(String newCondition) {
        System.out.println("\nWeather Update: " + newCondition);
        this.condition = newCondition;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(condition);
        }
    }
}
