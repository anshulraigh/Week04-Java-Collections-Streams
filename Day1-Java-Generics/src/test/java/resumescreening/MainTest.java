package resumescreening;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMainExecution() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
