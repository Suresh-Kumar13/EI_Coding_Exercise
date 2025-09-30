// MobileApp.java

public class MobileApp implements WeatherObserver {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String weatherCondition) {
        System.out.println("[" + appName + "] shows alert: " + weatherCondition);
    }
}
