package junit.basic.timeout;

public class PerformanceTester {

    /**
     * Simulates a long-running task by sleeping for 3 seconds.
     * @return a message indicating the task is completed.
     */
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Task Interrupted";
        }
        return "Task Completed";
    }
}
