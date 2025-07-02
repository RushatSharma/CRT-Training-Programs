//Q. Write a java code for displaying the name of employee, salary, employee id, designation.

import java.io.*;

class Salary {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Employee.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("ID: " + data[0]);
                System.out.println("Name: " + data[1]);
                System.out.println("Salary: " + data[2]);
                System.out.println("Designation: " + data[3]);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
