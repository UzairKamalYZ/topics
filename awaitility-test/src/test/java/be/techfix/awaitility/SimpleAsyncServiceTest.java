package be.techfix.awaitility;

import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SimpleAsyncServiceTest {
    private SimpleAsyncService simpleAsyncService;

    @BeforeEach
    void setUp() {
        simpleAsyncService = new SimpleAsyncService();
    }

    @Test
    void should_increment_the_counter_after_service_is_initialized() {
        simpleAsyncService.initialize();
        await().until(simpleAsyncService::isAlive);
        simpleAsyncService.incrementCounter();
        await().untilAsserted(() -> assertEquals(simpleAsyncService.getCounter().get(), 1L));
    }

    @Test
    void should_wait_for_at_least_1000_ms_to_increment_counter_successfully() {
        simpleAsyncService.initialize();
        await().atLeast(1000, TimeUnit.MILLISECONDS).atMost(2000, TimeUnit.MILLISECONDS).until(simpleAsyncService::isAlive);
        simpleAsyncService.incrementCounter();
        simpleAsyncService.incrementCounter();
        simpleAsyncService.incrementCounter();
        await().untilAsserted(() -> assertEquals(simpleAsyncService.getCounter().get(), 3L));
    }

    @Test
    void should_increment_the_counter_with_conditionEvaluationListener() {
        simpleAsyncService.initialize();
        await().with().conditionEvaluationListener(condition -> {
            System.out.printf("%s (elapsed time %dms, remaining time %dms)\n", condition.getDescription(), condition.getElapsedTimeInMS(), condition.getRemainingTimeInMS());
        }).until(simpleAsyncService::isAlive);
        simpleAsyncService.incrementCounter();
        await().untilAsserted(() -> assertEquals(simpleAsyncService.getCounter().get(), 1L));
    }
}