import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Rahul");                // add() adds an element
        names.add("Priya");
        names.add("Arjun");
        names.add("Priya");                // duplicate is ignored

        System.out.println("LinkedHashSet: " + names);
        System.out.println("Contains Arjun: " + names.contains("Arjun")); // contains() checks
        System.out.println("Size: " + names.size()); // size() gives number of elements

        names.remove("Priya");             // remove() removes an element
        System.out.println("After remove: " + names);

        names.clear();                     // clear() removes all elements
        System.out.println("Is Empty: " + names.isEmpty()); // isEmpty() checks
    }
}
