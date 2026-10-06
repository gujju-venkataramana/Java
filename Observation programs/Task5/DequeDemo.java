import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("B");          // addFirst() adds at the front
        deque.addLast("C");           // addLast() adds at the rear
        deque.addFirst("A");

        System.out.println("Deque: " + deque);
        System.out.println("First: " + deque.peekFirst()); // peekFirst() reads front
        System.out.println("Last: " + deque.peekLast());   // peekLast() reads rear

        deque.pollFirst();            // pollFirst() removes front
        deque.pollLast();             // pollLast() removes rear

        System.out.println("After removals: " + deque);
    }
}
