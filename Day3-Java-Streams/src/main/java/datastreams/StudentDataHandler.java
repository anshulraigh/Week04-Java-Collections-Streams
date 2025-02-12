package datastreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDataHandler {
    public static void writeStudentsToFile(String filePath, List<Student> students) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            for (Student student : students) {
                dos.writeInt(student.getRollNumber());
                dos.writeUTF(student.getName());
                dos.writeDouble(student.getGpa());
            }
        }
    }

    public static List<Student> readStudentsFromFile(String filePath) throws IOException {
        List<Student> students = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                students.add(new Student(rollNumber, name, gpa));
            }
        }
        return students;
    }
}
