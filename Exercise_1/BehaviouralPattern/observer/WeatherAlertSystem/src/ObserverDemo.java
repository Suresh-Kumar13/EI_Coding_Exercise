
public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        WeatherObserver app = new MobileApp("WeatherApp");
        WeatherObserver news = new News("NDTV");
        WeatherObserver govt = new GovernmentDepartment("Disaster Management");

        station.attach(app);
        station.attach(news);
        station.attach(govt);

        station.setCondition("Heavy Rainfall Warning");
        station.setCondition("Heatwave Alert");
    }
}
