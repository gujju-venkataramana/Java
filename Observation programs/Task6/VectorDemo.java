import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();

        names.add("Rahul");               // add() adds an element
        names.addElement("Priya");        // addElement() adds an element

        System.out.println("Vector: " + names);
        System.out.println("Element at index 0: " + names.get(0)); // get() reads an element
        System.out.println("Contains Priya: " + names.contains("Priya")); // contains() checks
        System.out.println("Size: " + names.size()); // size() gives number of elements
        System.out.println("Capacity: " + names.capacity()); // capacity() gives current capacity

        names.set(0, "Arjun");             // set() replaces an element
        names.remove("Priya");             // remove() removes a value
        names.removeElement("Arjun");      // removeElement() removes a value

        System.out.println("Final Vector: " + names);
    }
}
