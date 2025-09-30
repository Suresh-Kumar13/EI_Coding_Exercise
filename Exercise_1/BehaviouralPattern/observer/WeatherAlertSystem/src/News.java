
public class News implements WeatherObserver {
    private String msg;

    public News(String msg) {
        this.msg = msg;
    }

    @Override
    public void update(String weatherCondition) {
        System.out.println(msg+ " News:" + " Breaking News -> " + weatherCondition);
    }
}
