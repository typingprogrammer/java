import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.function.Function;

interface Heap<T> {
    void add(T elementToAdd);

    T peek();

    T remove();

    boolean isEmpty();
}

class HeapImpl<T> implements Heap<T> {

    private TreeSet<T> data;

    public HeapImpl() {
        data = new TreeSet<>();
    }

    @Override
    public void add(T elementToAdd) {
        data.add(elementToAdd);
    }

    @Override
    public T peek() {
        return data.first();
    }

    @Override
    public T remove() {
        return data.pollFirst();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}

public class HeapWithTreeSet {
    public static void main(String[] args) {

        HeapImpl<Integer> heap = new HeapImpl<>();
        heap.add(3);
        heap.add(4);
        heap.add(2);
        heap.add(0);
        heap.add(5);


        System.out.println("peeking = "+heap.peek());

        while(!heap.isEmpty()) {
            System.out.println(heap.remove());
        }

    }
}
