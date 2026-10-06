import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Arjun");

        Iterator<String> it = names.iterator(); // iterator() creates an Iterator

        System.out.println("Elements using Iterator:");

        while (it.hasNext()) {                 // hasNext() checks for next element
            String name = it.next();            // next() returns the next element
            System.out.println(name);
        }
    }
}
