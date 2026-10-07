import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");        // put() adds a key-value pair
        students.put(102, "Priya");
        students.put(103, "Arjun");

        System.out.println("HashMap: " + students);
        System.out.println("Student 102: " + students.get(102)); // get() returns a value
        System.out.println("Has key 101: " + students.containsKey(101)); // checks key
        System.out.println("Has value Rahul: " + students.containsValue("Rahul")); // checks value
        System.out.println("Keys: " + students.keySet());       // keySet() returns keys
        System.out.println("Values: " + students.values());     // values() returns values
        System.out.println("Entries: " + students.entrySet());   // entrySet() returns pairs
        System.out.println("Size: " + students.size());          // size() gives number of pairs
        System.out.println("Default: " + students.getOrDefault(104, "Not Found")); // default value

        students.remove(103);                                    // remove() removes by key
        System.out.println("Final HashMap: " + students);
    }
}
