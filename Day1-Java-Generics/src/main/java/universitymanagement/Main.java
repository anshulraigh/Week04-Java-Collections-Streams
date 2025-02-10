package universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Evaluation Type: " + course.getEvaluationType());
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Data Structures"));
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("Software Engineering"));
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("Artificial Intelligence"));

        List<CourseType> courses = new ArrayList<>();
        courses.add(examCourse.getCourseType());
        courses.add(assignmentCourse.getCourseType());
        courses.add(researchCourse.getCourseType());

        System.out.println("Displaying All Courses:");
        displayAllCourses(courses);
    }
}
