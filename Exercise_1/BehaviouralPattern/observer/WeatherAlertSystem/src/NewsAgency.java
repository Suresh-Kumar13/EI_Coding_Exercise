// NewsAgency.java

public class NewsAgency implements WeatherObserver {
    private String agencyName;

    public NewsAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(String weatherCondition) {
        System.out.println("News Agency (" + agencyName + "): Breaking News -> " + weatherCondition);
    }
}
