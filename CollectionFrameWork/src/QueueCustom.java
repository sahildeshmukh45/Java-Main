import java.util.*;

public class QueueCustom {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(45);
        queue.add(46);
        queue.add(47);
        queue.add(20);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

    }
}
