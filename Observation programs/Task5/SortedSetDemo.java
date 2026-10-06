import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);              // add() adds an element
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Sorted Set: " + numbers);
        System.out.println("First: " + numbers.first()); // first() gives smallest element
        System.out.println("Last: " + numbers.last());   // last() gives largest element

        System.out.println("Head Set: " + numbers.headSet(30)); // elements before 30
        System.out.println("Tail Set: " + numbers.tailSet(30)); // elements from 30
        System.out.println("Sub Set: " + numbers.subSet(10, 40)); // range of elements
    }
}
