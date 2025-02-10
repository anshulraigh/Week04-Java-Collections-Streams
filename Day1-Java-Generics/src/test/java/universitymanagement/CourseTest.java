package universitymanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void testCourseTypeDetails() {
        Course<ExamCourse> course = new Course<>(new ExamCourse("Data Structures"));
        assertEquals("Data Structures", course.getCourseType().getCourseName());
        assertEquals("Exam-Based", course.getCourseType().getEvaluationType());
    }

    @Test
    void testCourseDisplay() {
        Course<AssignmentCourse> course = new Course<>(new AssignmentCourse("Software Engineering"));
        assertDoesNotThrow(course::displayCourseDetails);
    }
}
