
public class GovernmentDepartment implements WeatherObserver {
    private String department;

    public GovernmentDepartment(String department) {
        this.department = department;
    }

    @Override
    public void update(String weatherCondition) {
        System.out.println("Government Department [" + department + "] taking action due to: " + weatherCondition);
    }
}
