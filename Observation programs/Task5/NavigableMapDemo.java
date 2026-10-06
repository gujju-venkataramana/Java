import java.util.*;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> students = new TreeMap<>();

        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(103, "Arjun");
        students.put(104, "Kiran");

        System.out.println("Navigable Map: " + students);

        System.out.println("Higher Key than 102: " + students.higherKey(102)); // next greater
        System.out.println("Lower Key than 102: " + students.lowerKey(102));   // next smaller
        System.out.println("Ceiling Key of 102: " + students.ceilingKey(102)); // >= key
        System.out.println("Floor Key of 102: " + students.floorKey(102));     // <= key

        System.out.println("Descending Map: " + students.descendingMap()); // reverse order
    }
}
