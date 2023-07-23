import java.util.PriorityQueue;

class PriorityQueueApp {
    public static void main(String[] args) {
        PriorityQueue<Boolean> pq = new PriorityQueue<Boolean>();
        // pq.add(100);
        // pq.add(120);
        // pq.add(20);
        // pq.add(75);
        // pq.add("Vig");
        pq.add(true);
        pq.add(false);
        pq.add(true);
        // pq.add(100);
        // pq.add(null);
        System.out.println(pq);
    }    
}
