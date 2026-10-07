import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Arjun");         // put() adds a key-value pair
        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(104, "Kiran");

        System.out.println("TreeMap: " + students);
        System.out.println("Student 102: " + students.get(102)); // get() returns a value
        System.out.println("First Key: " + students.firstKey()); // smallest key
        System.out.println("Last Key: " + students.lastKey());   // largest key
        System.out.println("Higher Key: " + students.higherKey(102)); // next greater
        System.out.println("Lower Key: " + students.lowerKey(102));   // next smaller
        System.out.println("Ceiling Key: " + students.ceilingKey(102)); // >= key
        System.out.println("Floor Key: " + students.floorKey(102));     // <= key

        students.remove(104);               // remove() removes by key
        System.out.println("Final TreeMap: " + students);
    }
}
