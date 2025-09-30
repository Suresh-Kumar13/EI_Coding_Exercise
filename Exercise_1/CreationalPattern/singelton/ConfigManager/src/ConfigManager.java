
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static ConfigManager instance;
    private Map<String, String> settings;

    // Private constructor
    private ConfigManager() {
        settings = new HashMap<>();
        // Simulating loading from file or environment variables
        settings.put("appName", "InterviewApp");
        settings.put("version", "1.0");
        settings.put("dbUrl", "jdbc:mysql://localhost:3306/interviewdb");
        System.out.println("Configuration Loaded...");
    }

    // Thread-safe Singleton (Lazy Initialization)
    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}
