package datastreams;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StudentDataHandlerTest {
    private static final String TEST_FILE_PATH = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_students.dat";

    @Test
    public void testWriteAndReadStudents() throws IOException {
        List<Student> studentsToWrite = List.of(
                new Student(201, "Aryan", 8.8),
                new Student(202, "Neha", 9.5)
        );

        StudentDataHandler.writeStudentsToFile(TEST_FILE_PATH, studentsToWrite);
        List<Student> retrievedStudents = StudentDataHandler.readStudentsFromFile(TEST_FILE_PATH);

        assertEquals(2, retrievedStudents.size(), "Two students should be retrieved.");
        assertEquals("Aryan", retrievedStudents.get(0).getName(), "First student's name should match.");
        assertEquals("Neha", retrievedStudents.get(1).getName(), "Second student's name should match.");
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        List<Student> studentsToWrite = List.of(new Student(301, "Kunal", 7.9));
        StudentDataHandler.writeStudentsToFile(TEST_FILE_PATH, studentsToWrite);

        File file = new File(TEST_FILE_PATH);
        assertTrue(file.exists(), "File should exist after writing students.");
    }
}
