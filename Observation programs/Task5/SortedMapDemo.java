import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Arjun");       // put() adds a key-value pair
        students.put(101, "Rahul");
        students.put(102, "Priya");

        System.out.println("Sorted Map: " + students);
        System.out.println("First Key: " + students.firstKey()); // firstKey() gives smallest key
        System.out.println("Last Key: " + students.lastKey());   // lastKey() gives largest key

        System.out.println("Head Map: " + students.headMap(103)); // keys before 103
        System.out.println("Tail Map: " + students.tailMap(102)); // keys from 102
        System.out.println("Sub Map: " + students.subMap(101, 103)); // key range
    }
}
