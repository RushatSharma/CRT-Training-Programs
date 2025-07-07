import java.util.*;

class InvalidCreditsException extends Exception {
    public InvalidCreditsException(String message) {
        super(message);
    }
}

abstract class Course {
    protected String courseId;
    protected String title;
    protected Integer credits;

    public Course(String courseId, String title, Integer credits) throws InvalidCreditsException {
        if (credits < 1 || credits > 10) {
            throw new InvalidCreditsException("Credits must be between 1 and 10.");
        }
        this.courseId = courseId;
        this.title = title;
        this.credits = credits;
    }

    public abstract double calculateFees();

    public void displayDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Fees: a" + calculateFees());
        System.out.println("");
    }
}

class TheoryCourse extends Course {
    public TheoryCourse(String courseId, String title, Integer credits) throws InvalidCreditsException {
        super(courseId, title, credits);
    }

    @Override
    public double calculateFees() {
        return credits * 1500;
    }
}

class LabCourse extends Course {
    public LabCourse(String courseId, String title, Integer credits) throws InvalidCreditsException {
        super(courseId, title, credits);
    }

    @Override
    public double calculateFees() {
        return (credits * 1500) + 2000;
    }
}

public class UniversityCourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> courseList = new ArrayList<>();

        try {

            courseList.add(new TheoryCourse("T101", "Data Structures", 4));
            courseList.add(new LabCourse("L201", "Operating Systems Lab", 3));
            courseList.add(new TheoryCourse("T102", "Algorithms", 5));
            courseList.add(new LabCourse("L202", "Java Programming Lab", 2));

            // courseList.add(new TheoryCourse("T103", "Invalid Course", -2));

            System.out.println("\nUniversity Course Details:\n");
            for (Course c : courseList) {
                c.displayDetails();
            }

        } catch (InvalidCreditsException e) {
            System.out.println("Exception Caught in Main: " + e.getMessage());
        }

        sc.close();
    }
}
