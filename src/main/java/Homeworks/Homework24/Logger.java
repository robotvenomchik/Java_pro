package Homeworks.Homework24;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger instance;

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    private FileWriter fileWriter;

    private LocalDate currentDate;

    private Logger() {
        initializeFileWriter();
    }

    private void initializeFileWriter() {
        try {
            currentDate = LocalDate.now();
            String fileName = "src/main/java/Homeworks/Homework24/logs/" + currentDate.format(DATE_FORMAT) + ".txt";
            fileWriter = new FileWriter(fileName, true);
        } catch (IOException e) {
            System.err.println("Error initializing log file: " + e.getMessage());
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        try {
            if (!LocalDate.now().equals(currentDate)) {
                initializeFileWriter();
            }
            String time = LocalTime.now().format(TIME_FORMAT);

            fileWriter.write("[" + currentDate.format(DATE_FORMAT) + " " + time + "] " + message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }

    public void close() {
        try {
            if (fileWriter != null) {
                fileWriter.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing log file: " + e.getMessage());
        }
    }
}



