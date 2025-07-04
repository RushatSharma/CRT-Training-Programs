import java.util.Scanner;

public class ReverseString {

    public static void printReverse(String str, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(str.charAt(index));
        printReverse(str, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Reversed string: ");
        printReverse(input, input.length() - 1);

        sc.close();
    }
}
