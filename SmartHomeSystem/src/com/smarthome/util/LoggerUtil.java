package com.smarthome.util;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerUtil {
   private static final String LOG_FILE = "SmartHomeSystem\\logs\\app.log"; 

    public static void log(String message) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
            fw.write(LocalDateTime.now() + " [LOG] " + message + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Logging failed: " + e.getMessage());
        }
    }
}
