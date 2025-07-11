import java.util.*;

public class AdvTimer {
    private int seconds;
    private int currentSecond = 0;
    private boolean isPaused = false;
    private boolean isStopped = false;
    private Thread timerThread;
    private final Object lock = new Object();

    public AdvTimer(int seconds) {
        this.seconds = seconds;
    }

    public void startTimer() {
        timerThread = new Thread(() -> {
            while (currentSecond < seconds) {
                synchronized (lock) {
                    if (isStopped)
                        break;
                    while (isPaused) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            System.out.println("Timer interrupted due to pause.");
                            return;
                        }
                        if (isStopped)
                            break;
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Timer interrupted.");
                    return;
                }

                synchronized (lock) {
                    if (isStopped)
                        break;
                    if (isPaused)
                        continue;
                }

                currentSecond++;
                System.out.println("Seconds passed: " + currentSecond);
            }

            if (!isStopped && currentSecond == seconds) {
                System.out.println("Timer is completed.");
            } else if (isStopped) {
                System.out.println("Timer was stopped.");
            }
        });

        timerThread.start();
    }

    public void pauseTimer() {
        synchronized (lock) {
            if (!isPaused && !isStopped) {
                isPaused = true;
                System.out.println("Timer paused at: " + currentSecond + " second(s).");
            }
        }
    }

    public void resumeTimer() {
        synchronized (lock) {
            if (isPaused && !isStopped) {
                isPaused = false;
                lock.notify();
                System.out.println("Timer has resumed.");
            }
        }
    }

    public void stopTimer() {
        synchronized (lock) {
            if (!isStopped) {
                isStopped = true;
                isPaused = false;
                lock.notify();
                System.out.println("Timer has stopped.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the timer duration in seconds: ");
        int n = sc.nextInt();

        AdvTimer timer = new AdvTimer(n);
        timer.startTimer();

        while (true) {
            System.out.println("\nOptions: Press 'p' to pause, 'r' to resume, 's' to stop");
            String cmd = sc.next().toLowerCase();

            switch (cmd) {
                case "p":
                    timer.pauseTimer();
                    break;
                case "r":
                    timer.resumeTimer();
                    break;
                case "s":
                    timer.stopTimer();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
