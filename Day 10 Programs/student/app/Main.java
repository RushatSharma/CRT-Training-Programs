package student.app;

import student.core.Student;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Rushat Sharma", 101, "A"));
        studentList.add(new Student("Ram Sharma", 102, "B+"));

        System.out.println("\n--- Student Records ---");
        for (Student s : studentList) {
            System.out.println("Name: " + s.name() + ", Roll No: " + s.rollNo() + ", Grade: " + s.grade());
        }

        System.out.println("\n--- Grade Report ---");
        for (Student s : studentList) {
            String report = """
                    ----------------------------
                    Name       : %s
                    Roll No.   : %d
                    Grade      : %s
                    ----------------------------
                    """.formatted(s.name(), s.rollNo(), s.grade());

            System.out.println(report);
        }
    }
}
