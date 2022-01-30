import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    //first in, first out
    // add - enqueue, delete - dequeue, view, contains

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //add
        queue.add(2);
        queue.add(5);
        queue.add(3);
        queue.offer(6);

        System.out.println("queue = "+queue);

        //view
        System.out.println(queue.peek());
        System.out.println(queue.element());

        //dequeue
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);


        System.out.println("size = " + queue.size());
        System.out.println("is empty = " + queue.isEmpty());

    }

}
