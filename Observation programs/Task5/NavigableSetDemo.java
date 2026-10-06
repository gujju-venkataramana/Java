import java.util.*;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Navigable Set: " + numbers);

        System.out.println("Higher than 20: " + numbers.higher(20));   // higher() gives next greater
        System.out.println("Lower than 20: " + numbers.lower(20));     // lower() gives next smaller
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));   // ceiling() gives >= value
        System.out.println("Floor of 25: " + numbers.floor(25));       // floor() gives <= value

        System.out.println("Descending Set: " + numbers.descendingSet()); // reverse order
    }
}
