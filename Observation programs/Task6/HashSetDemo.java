import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);                   // add() adds an element
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);                   // duplicate is ignored

        System.out.println("HashSet: " + numbers);
        System.out.println("Contains 20: " + numbers.contains(20)); // contains() checks
        System.out.println("Size: " + numbers.size()); // size() gives number of elements

        numbers.remove(10);                // remove() removes an element
        System.out.println("After remove: " + numbers);

        numbers.clear();                   // clear() removes all elements
        System.out.println("Is Empty: " + numbers.isEmpty()); // isEmpty() checks
    }
}
