import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);                    // add() adds an element
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("TreeSet: " + numbers);
        System.out.println("First: " + numbers.first()); // first() gives smallest element
        System.out.println("Last: " + numbers.last());   // last() gives largest element
        System.out.println("Higher than 20: " + numbers.higher(20)); // next greater
        System.out.println("Lower than 20: " + numbers.lower(20));   // next smaller
        System.out.println("Ceiling of 25: " + numbers.ceiling(25)); // >= value
        System.out.println("Floor of 25: " + numbers.floor(25));     // <= value

        System.out.println("Poll First: " + numbers.pollFirst()); // removes smallest
        System.out.println("Poll Last: " + numbers.pollLast());   // removes largest
        System.out.println("Final TreeSet: " + numbers);
    }
}
