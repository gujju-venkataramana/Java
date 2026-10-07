import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("B");                // addFirst() adds at the front
        deque.addLast("C");                 // addLast() adds at the rear
        deque.offerFirst("A");              // offerFirst() adds at the front
        deque.offerLast("D");               // offerLast() adds at the rear

        System.out.println("ArrayDeque: " + deque);
        System.out.println("First: " + deque.peekFirst()); // peekFirst() reads front
        System.out.println("Last: " + deque.peekLast());   // peekLast() reads rear

        System.out.println("Poll First: " + deque.pollFirst()); // removes front
        System.out.println("Poll Last: " + deque.pollLast());   // removes rear

        System.out.println("Final ArrayDeque: " + deque);
    }
}
