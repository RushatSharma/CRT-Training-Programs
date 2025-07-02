import java.util.Scanner;

public class Data_Usage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data usage in GB: ");
        double dataUsed = sc.nextDouble();
        double Bill = 0.0;

        if (dataUsed < 0) {
            System.out.println("Usage cannot be negative");
        } else if (dataUsed > 0 && dataUsed < 1) {
            System.out.println("Low usage no billing");
        } else if (dataUsed >= 1 && dataUsed <= 3) {
            Bill = (dataUsed - 1) * 10;
        } else {
            Bill = (dataUsed - 1) * 20;
        }

        System.out.println("Total Bill = " + Bill);
        sc.close();
    }
}
