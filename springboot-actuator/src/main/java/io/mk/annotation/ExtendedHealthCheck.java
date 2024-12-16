package io.mk.annotation;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component("ExtendedHealthCheck")
public class ExtendedHealthCheck implements HealthIndicator {

    @Override
    public Health health() {
        // Check our own health
        boolean dbServiceAvailable = isDBserviceAvailable();
        if (dbServiceAvailable) {
            return Health.down().withDetail("Error Code", "Db Service not available").build();
        }
        return Health.up().build();
    }

    private boolean isDBserviceAvailable() {
        return LocalTime.now().getSecond() % 2 == 0;
    }

}
