import java.util.Scanner;

public class Traffic_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time, position_in_cycle;
        System.out.print("Enter the value of time: ");
        time = sc.nextInt();
        position_in_cycle = time % 120;

        if (position_in_cycle >= 0 && position_in_cycle <= 60) {
            System.out.println("Green Light");
        } else if (position_in_cycle >= 60 && position_in_cycle <= 65) {
            System.out.println("Yellow Light");
        } else if (position_in_cycle <= 65 && position_in_cycle < 120) {
            System.out.println("Red Light");
        }
        sc.close();
    }
}
