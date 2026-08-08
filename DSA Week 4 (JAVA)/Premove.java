import java.util.PriorityQueue;
import java.util.Queue;
public class Premove {
    public static void main(String args[]) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("Life");
        pq.add("is");
        pq.add("Beautiful");
        System.out.println("Initial Queue: " + pq);
        pq.remove("Good");
        System.out.println("After Remove: " + pq);
        System.out.println("Poll Method: " + pq.poll());
        System.out.println("Final Queue: " + pq);
    }
}
