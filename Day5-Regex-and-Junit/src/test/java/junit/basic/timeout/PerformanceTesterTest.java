package junit.basic.timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

public class PerformanceTesterTest {

    // This test will fail if longRunningTask() takes more than 2 seconds.
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTaskPerformance() {
        String result = PerformanceTester.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
