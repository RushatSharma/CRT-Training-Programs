public class Method_Overloading {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10: " + add(5, 10));
        System.out.println("Sum of 2.5 and 4.3: " + add(2.5, 4.3));
    }
}
