package employee.core;

public sealed abstract class Employee permits FullTimeEmployee, PartTimeEmployee, Intern {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}
