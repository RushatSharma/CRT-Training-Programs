import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(20);
        queue.add(30);

        queue.poll();

        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
