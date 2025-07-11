class EvenPrinter implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddPrinter implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Even_Odd_Thread {
    public static void main(String[] args) {
        Runnable evenTask = new EvenPrinter();
        Runnable oddTask = new OddPrinter();

        Thread evenThread = new Thread(evenTask);
        Thread oddThread = new Thread(oddTask);

        evenThread.start();
        oddThread.start();
    }
}
