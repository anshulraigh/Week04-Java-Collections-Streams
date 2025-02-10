package universitymanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExamCourseTest {

    @Test
    void testEvaluationType() {
        ExamCourse course = new ExamCourse("Data Structures");
        assertEquals("Exam-Based", course.getEvaluationType());
    }
}
