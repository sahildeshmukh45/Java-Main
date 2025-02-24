import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCustom {
    // for giving priority, priority queue is used
    // in min heap smallest element comes first in array, by default priority is also min heap
    // in max heap biggest element comes first in array;
    // we can define priority queue
    public static void main(String[] args) {
        Queue <Integer> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());

    }
}
