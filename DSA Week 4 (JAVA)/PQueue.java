import java.util.PriorityQueue;
import java.util.Queue;

public class PQueue {
    public static void main(String[] args) {
        // create a PriorityQueue of integers
        Queue<Integer> pq = new PriorityQueue<>();
        // Adding elements to the PriorityQueue
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        pq.add(30);

        // Displaying the elements of the PriorityQueue
        System.out.println("PriorityQueue elements: " + pq);
    }
}
