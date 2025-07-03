import java.util.Scanner;

public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter data usage in GB: ");
        double tax = 0;
        double salary = var1.nextDouble();

        if (salary <= 250000) {
            tax = 0;
        } else if (salary <= 500000) {
            tax = (salary - 250000) * 0.05;
        } else if (salary <= 1000000) {
            tax = (250000 * 0.05) + (salary - 500000) * 0.20;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.20) + (salary - 1000000) * 0.30;
        }

        System.out.println("Total Income Tax to be paid: ₹" + tax);
        var1.close();
    }

}
