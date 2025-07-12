package employee.app;

import employee.core.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Amit Sharma", 50000));
        employees.add(new PartTimeEmployee("Priya Joshi", 20, 800));
        employees.add(new Intern("Rahul Verma", 10000));

        for (Employee emp : employees) {
            String type = switch (emp) {
                case FullTimeEmployee f -> "Full-Time";
                case PartTimeEmployee p -> "Part-Time";
                case Intern i -> "Intern";
            };

            double salary = emp.calculateSalary();

            System.out.println("");
            System.out.println("""
                    ----------------------------
                    Name      : %s
                    Type      : %s
                    Salary    : %.2f
                    ----------------------------
                    """.formatted(emp.getName(), type, salary));
        }
    }
}
