import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        heap.add(5);
        heap.add(14);
        heap.add(23);
        heap.add(20);
        heap.add(16);
        heap.add(48);
        heap.add(62);
        heap.add(53);
        heap.add(4);

        while(!heap.isEmpty()) {
            System.out.println(heap.poll());
        }
    }
}
