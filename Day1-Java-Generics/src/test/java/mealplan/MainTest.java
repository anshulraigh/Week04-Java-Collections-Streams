package mealplan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMainMethodRuns() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
