import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> students = new Hashtable<>();

        students.put(101, "Rahul");         // put() adds a key-value pair
        students.put(102, "Priya");
        students.put(103, "Arjun");

        System.out.println("Hashtable: " + students);
        System.out.println("Student 102: " + students.get(102)); // get() returns a value
        System.out.println("Has key 101: " + students.containsKey(101)); // checks key
        System.out.println("Has value Rahul: " + students.containsValue("Rahul")); // checks value
        System.out.println("Keys: " + students.keys());        // keys() returns an enumeration of keys
        System.out.println("Elements: " + students.elements()); // elements() returns values
        System.out.println("Size: " + students.size());         // size() gives number of pairs

        students.remove(103);                                   // remove() removes by key
        System.out.println("Is Empty: " + students.isEmpty());  // isEmpty() checks the table
        System.out.println("Final Hashtable: " + students);
    }
}
