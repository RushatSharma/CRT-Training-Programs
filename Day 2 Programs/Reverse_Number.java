public class Reverse_Number {
    public static void main(String[] args) {
        int number = 5468;
        int digit;
        int rev = 0;

        while (number != 0) {
            digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;
        }
        System.out.println("Reverse of the number is: " + rev);
    }

}