public class Employee {
    private String name;
    private double basicSalary;
    static String companyName = "TechCorp";

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public Employee(String name) {
        this.name = name;
        this.basicSalary = 30000;
    }

    public double calculateHRA() {
        return 0.20 * basicSalary;
    }

    public double calculateTotalSalary() {
        return basicSalary + calculateHRA();
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + companyName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob");

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
