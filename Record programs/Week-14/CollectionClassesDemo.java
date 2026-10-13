import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.PriorityQueue;
public class CollectionClassesDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        System.out.println("ArrayList: " + list);
        LinkedList<Integer> linked = new LinkedList<Integer>();
        linked.add(10);
        linked.add(20);
        linked.addFirst(5);
        System.out.println("LinkedList: " + linked);
        HashSet<String> set = new HashSet<String>();
        set.add("Red");
        set.add("Blue");
        set.add("Red");
        System.out.println("HashSet: " + set);
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(30);
        tree.add(10);
        tree.add(20);
        System.out.println("TreeSet: " + tree);
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(30);
        queue.add(10);
        queue.add(20);
        System.out.println("PriorityQueue head: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("PriorityQueue after removal: " + queue);
    }
}
