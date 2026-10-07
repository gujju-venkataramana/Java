import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);                      // add() adds an element
        queue.offer(10);                    // offer() adds an element
        queue.offer(20);

        System.out.println("PriorityQueue: " + queue);
        System.out.println("Peek: " + queue.peek()); // peek() reads highest-priority element
        System.out.println("Contains 20: " + queue.contains(20)); // contains() checks
        System.out.println("Size: " + queue.size()); // size() gives number of elements

        System.out.println("Poll: " + queue.poll()); // poll() removes highest-priority element
        queue.remove(Integer.valueOf(30));            // remove(Object) removes a value

        System.out.println("Final PriorityQueue: " + queue);
    }
}
