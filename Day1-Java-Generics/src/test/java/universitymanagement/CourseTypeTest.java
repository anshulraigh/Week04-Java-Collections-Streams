package universitymanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTypeTest {

    @Test
    void testCourseName() {
        CourseType course = new ExamCourse("Operating Systems");
        assertEquals("Operating Systems", course.getCourseName());
    }

    @Test
    void testEvaluationType() {
        CourseType course = new ResearchCourse("Machine Learning");
        assertEquals("Research-Based", course.getEvaluationType());
    }
}
