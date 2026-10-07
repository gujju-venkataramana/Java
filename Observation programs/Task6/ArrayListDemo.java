import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");              // add() adds an element
        names.add("Priya");
        names.add(1, "Arjun");            // add(index, value) inserts at a position

        System.out.println("ArrayList: " + names);
        System.out.println("Element at index 1: " + names.get(1)); // get() reads an element
        System.out.println("Contains Priya: " + names.contains("Priya")); // contains() checks
        System.out.println("Size: " + names.size()); // size() gives number of elements
        System.out.println("Index of Priya: " + names.indexOf("Priya")); // indexOf() finds position

        names.set(0, "Kiran");            // set() replaces an element
        names.remove("Arjun");            // remove(Object) removes a value
        names.sort(null);                 // sort() sorts the list

        System.out.println("Updated ArrayList: " + names);
    }
}
