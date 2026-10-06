import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");       // put() adds a key-value pair
        students.put(102, "Priya");
        students.put(103, "Arjun");

        System.out.println("Map: " + students);
        System.out.println("Student 102: " + students.get(102)); // get() returns value for a key
        System.out.println("Has key 101: " + students.containsKey(101)); // checks key
        System.out.println("Has value Rahul: " + students.containsValue("Rahul")); // checks value

        System.out.println("Keys: " + students.keySet());      // keySet() returns all keys
        System.out.println("Values: " + students.values());    // values() returns all values
        System.out.println("Entries: " + students.entrySet());  // entrySet() returns pairs

        students.remove(103);             // remove() removes a pair using its key
        System.out.println("After remove: " + students);
    }
}
