package com.example.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class DelayedMessageService {

    private static final Logger logger = LoggerFactory.getLogger(DelayedMessageService.class);
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    @PostConstruct
    public void scheduleDelayedMessage() {
        scheduler.schedule(() -> logger.info("5 секунд від запуску програми"), 5, TimeUnit.SECONDS);
    }

    @PreDestroy
    public void shutdownScheduler() {
        scheduler.shutdown();
    }
}