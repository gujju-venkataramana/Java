import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Rahul");        // put() adds a key-value pair
        students.put(102, "Priya");
        students.put(103, "Arjun");

        System.out.println("LinkedHashMap: " + students);
        System.out.println("Student 102: " + students.get(102)); // get() returns a value
        System.out.println("Has key 101: " + students.containsKey(101)); // checks key
        System.out.println("Keys: " + students.keySet());       // keySet() returns keys
        System.out.println("Values: " + students.values());     // values() returns values
        System.out.println("Entries: " + students.entrySet());   // entrySet() returns pairs

        students.remove(102);                                  // remove() removes by key
        System.out.println("Final LinkedHashMap: " + students);
    }
}
