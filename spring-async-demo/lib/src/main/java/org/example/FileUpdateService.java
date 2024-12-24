package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Service
public class FileUpdateService {

    private static final Logger logger = LoggerFactory.getLogger(FileUpdateService.class);
    private int counter = 0;
    private final Path filePath = Paths.get("updated_data.txt");

    public FileUpdateService() {
        // Створюємо файл, якщо він не існує
        if (!Files.exists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                logger.error("Помилка при створенні файлу", e);
            }
        }
    }

    @Scheduled(fixedRate = 10000) // Виконувати кожні 10 секунд
    public void updateFile() {
        counter += 5;
        String dataToAppend = "Лічильник: " + counter + "\n";

        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND)) {
            writer.write(dataToAppend);
            logger.info("Записано у файл: {}", dataToAppend.trim());
        } catch (IOException e) {
            logger.error("Помилка при записі у файл", e);
        }
    }
}
