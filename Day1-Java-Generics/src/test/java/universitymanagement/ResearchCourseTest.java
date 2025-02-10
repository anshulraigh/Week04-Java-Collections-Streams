package universitymanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResearchCourseTest {

    @Test
    void testEvaluationType() {
        ResearchCourse course = new ResearchCourse("Artificial Intelligence");
        assertEquals("Research-Based", course.getEvaluationType());
    }
}
