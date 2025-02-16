package com.crimedata.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingUtil {

    private static final String LOG_FILE_PATH = "logs/crime_data_analysis.log";

    // Method to log a message with a timestamp
    public static void log(String message) {
        try {
            File logFile = new File(LOG_FILE_PATH);
            logFile.getParentFile().mkdirs();  // Create directories if they don't exist
            logFile.createNewFile();  // Create the log file if it doesn't exist

            try (FileWriter fileWriter = new FileWriter(logFile, true);
                 PrintWriter printWriter = new PrintWriter(fileWriter)) {

                // Write the timestamp and message to the log file
                String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                printWriter.println("[" + timestamp + "] " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
