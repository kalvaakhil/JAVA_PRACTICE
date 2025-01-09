import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the priority queue
        pq.add(10);
        pq.add(5);
        pq.add(15);
        pq.add(2);

        List<Integer> list=new ArrayList<>(2);
        list.add(1);
        list.add(2);
        list.add(3);




        System.out.println(list.remove(list.get(2)));


        // Printing the elements
        System.out.println("PriorityQueue: " + pq);

        // Removing elements based on priority
        System.out.println("Polling (Removing smallest): " + pq.poll());
        System.out.println("Peek (View smallest): " + pq.peek());

        // Final state
        System.out.println("Remaining PriorityQueue: " + pq);
    }
}

