import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");             // offer() adds an element to the queue
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);
        System.out.println("Front: " + queue.peek()); // peek() reads the front element

        System.out.println("Removed: " + queue.poll()); // poll() removes the front element
        System.out.println("Queue after poll: " + queue);

        queue.add("D");              // add() also adds an element
        System.out.println("Final Queue: " + queue);
    }
}
