import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> items = new ArrayList<>();

        items.add("Java");       // add() adds an element
        items.add("Python");
        items.add("C");

        System.out.println("Collection: " + items);
        System.out.println("Size: " + items.size());       // size() gives number of elements
        System.out.println("Contains Java: " + items.contains("Java")); // contains() checks an element

        items.remove("C");       // remove() removes an element
        System.out.println("After remove: " + items);

        items.clear();           // clear() removes all elements
        System.out.println("Is Empty: " + items.isEmpty()); // isEmpty() checks whether collection is empty
    }
}
