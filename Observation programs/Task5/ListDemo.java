import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Rahul");          // add() adds an element
        names.add("Priya");
        names.add("Rahul");          // List allows duplicates
        names.add(1, "Arjun");       // add(index, value) inserts at a position

        System.out.println("List: " + names);
        System.out.println("Element at index 1: " + names.get(1)); // get() reads an element
        System.out.println("Index of Rahul: " + names.indexOf("Rahul")); // indexOf() finds first position

        names.set(0, "Kiran");       // set() replaces an element
        names.remove(2);             // remove(index) removes by position

        System.out.println("Updated List: " + names);
    }
}
