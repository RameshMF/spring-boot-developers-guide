package com.companyname.springbootscheduler.scheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleConfigurableJob {

	private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleConfigurableJob.class);

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Scheduled(fixedRateString = "${fixedRate.in.milliseconds}")
    public void scheduleTaskWithFixedRate() {
        LOGGER.info("Fixed Rate Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()) );
    }

    @Scheduled(fixedRateString = "${fixedRate.in.milliseconds}", initialDelayString = "${initialDelay.in.milliseconds}")
    public void scheduleTaskWithInitialDelay() {
        LOGGER.info("Fixed Rate Task with Initial Delay :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }

    @Scheduled(cron = "${cron.expression}")
    public void scheduleTaskWithCronExpression() {
        LOGGER.info("Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }
}
