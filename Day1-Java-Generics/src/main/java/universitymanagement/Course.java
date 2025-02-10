package universitymanagement;

public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseType.getCourseName());
        System.out.println("Evaluation Type: " + courseType.getEvaluationType());
    }
}
