package Homeworks.Homework11;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandler {

    public String createFile(String path) {
        Path newFile = Paths.get(path);
        try {
            Files.createFile(newFile);
        } catch (FileAlreadyExistsException e) {
            return "File already exists!";
        } catch (IOException e) {
            return "Something went wrong: " + e.getMessage();
        }
        return "Created " + newFile;
    }

    public String writeToFile(Path path, String content) {
        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            return "Error writing to file: " + e.getMessage();
        }
        return "Recorded in " + path;
    }

    public String readFromFile(String path) {
        Path filePath = Paths.get(path);
        try {
            return Files.readString(filePath);
        } catch (IOException e) {
            return "Error reading file: " + e.getMessage();
        }
    }
}
