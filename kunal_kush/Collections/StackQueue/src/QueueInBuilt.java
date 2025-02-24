import java.util.LinkedList;
import java.util.Queue;

public class QueueInBuilt {
    public static void main(String[] args) {
        // queue is like real life queue
        // insertion is happening at the end
        // it is first in first out
        // last in last out



        // queue is interface it is like linkedList, LinkedList also
        Queue<Integer> queue= new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);


        System.out.println(queue.peek());
        System.out.println(queue.remove()); // here 3 will remove
        System.out.println(queue.remove()); // here 4 will remove
        System.out.println(queue.remove()); // here 5 will remove  this is FIRST IN FIRST OUT
    }
}
