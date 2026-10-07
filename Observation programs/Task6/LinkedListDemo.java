import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Rahul");               // add() adds an element
        names.add("Priya");
        names.addFirst("Arjun");          // addFirst() adds at the beginning
        names.addLast("Kiran");           // addLast() adds at the end

        System.out.println("LinkedList: " + names);
        System.out.println("First: " + names.getFirst()); // getFirst() returns first element
        System.out.println("Last: " + names.getLast());   // getLast() returns last element
        System.out.println("Element at index 1: " + names.get(1)); // get() reads by index

        names.offer("Anu");               // offer() adds an element to the queue
        System.out.println("After offer: " + names);
        System.out.println("Peek: " + names.peek());     // peek() reads the first element
        System.out.println("Poll: " + names.poll());     // poll() removes the first element

        names.removeFirst();              // removeFirst() removes the first element
        names.removeLast();               // removeLast() removes the last element

        System.out.println("Final LinkedList: " + names);
    }
}
