package universitymanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AssignmentCourseTest {

    @Test
    void testEvaluationType() {
        AssignmentCourse course = new AssignmentCourse("Software Engineering");
        assertEquals("Assignment-Based", course.getEvaluationType());
    }
}
