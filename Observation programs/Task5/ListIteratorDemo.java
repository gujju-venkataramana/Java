import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Arjun");

        ListIterator<String> it = names.listIterator(); // creates ListIterator

        System.out.println("Forward Direction:");

        while (it.hasNext()) {                 // hasNext() checks forward element
            System.out.println(it.next());     // next() moves forward
        }

        System.out.println("Backward Direction:");

        while (it.hasPrevious()) {             // hasPrevious() checks previous element
            System.out.println(it.previous()); // previous() moves backward
        }
    }
}
