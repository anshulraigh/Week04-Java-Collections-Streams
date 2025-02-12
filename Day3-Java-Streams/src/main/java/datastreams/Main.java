package datastreams;

import java.io.IOException;
import java.util.List;

public class Main {
    private static final String FILE_PATH = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\students.dat";

    public static void main(String[] args) {
        Student student1 = new Student(101, "Anshul", 8.5);
        Student student2 = new Student(102, "Rohan", 9.2);

        try {
            StudentDataHandler.writeStudentsToFile(FILE_PATH, List.of(student1, student2));
            System.out.println("Students written to file successfully!");

            List<Student> students = StudentDataHandler.readStudentsFromFile(FILE_PATH);
            System.out.println("Retrieved Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
