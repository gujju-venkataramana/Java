import java.util.*;

public class CollectionFrameworkDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================= COLLECTION =================
        System.out.println("===== COLLECTION INTERFACE =====");

        ArrayList<String> collection = new ArrayList<>();
        ArrayList<String> extra = new ArrayList<>();

        System.out.print("Enter first element: ");
        String first = sc.nextLine();

        System.out.print("Enter second element: ");
        String second = sc.nextLine();

        collection.add(first);
        collection.add(second);

        extra.add("Java");
        extra.add("Python");

        collection.addAll(extra);

        System.out.println("Collection: " + collection);
        System.out.println("Size: " + collection.size());
        System.out.println("Contains Java: " + collection.contains("Java"));
        System.out.println("Contains all: " + collection.containsAll(extra));
        System.out.println("Is Empty: " + collection.isEmpty());

        collection.remove("Python");
        collection.removeAll(extra);

        System.out.println("After remove operations: " + collection);

        collection.addAll(extra);
        collection.clear();

        System.out.println("After clear: " + collection);
        System.out.println("Is Empty: " + collection.isEmpty());

        // ================= LIST =================
        System.out.println("\n===== LIST INTERFACE =====");

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("Java");

        list.add(1, "C++");

        System.out.println("List: " + list);
        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, "HTML");
        System.out.println("After set: " + list);

        list.remove(1);

        System.out.println("First Java index: " + list.indexOf("Java"));
        System.out.println("Last Java index: " + list.lastIndexOf("Java"));

        System.out.println("Sub List: " + list.subList(0, 2));

        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + list);

        // ================= SET =================
        System.out.println("\n===== SET INTERFACE =====");

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println("Set: " + set);
        System.out.println("Contains Java: " + set.contains("Java"));
        System.out.println("Size: " + set.size());
        System.out.println("Is Empty: " + set.isEmpty());

        set.remove("Python");
        System.out.println("After remove: " + set);

        set.clear();
        System.out.println("After clear: " + set);

        // ================= SORTED SET =================
        System.out.println("\n===== SORTED SET INTERFACE =====");

        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(30);
        sortedSet.add(10);
        sortedSet.add(20);
        sortedSet.add(40);

        System.out.println("Sorted Set: " + sortedSet);
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());
        System.out.println("Head Set: " + sortedSet.headSet(30));
        System.out.println("Tail Set: " + sortedSet.tailSet(20));
        System.out.println("Sub Set: " + sortedSet.subSet(20, 40));
        System.out.println("Comparator: " + sortedSet.comparator());

        // ================= NAVIGABLE SET =================
        System.out.println("\n===== NAVIGABLE SET INTERFACE =====");

        NavigableSet<Integer> navSet = new TreeSet<>();

        navSet.add(10);
        navSet.add(20);
        navSet.add(30);
        navSet.add(40);

        System.out.println("Set: " + navSet);
        System.out.println("Lower than 30: " + navSet.lower(30));
        System.out.println("Floor of 30: " + navSet.floor(30));
        System.out.println("Ceiling of 25: " + navSet.ceiling(25));
        System.out.println("Higher than 30: " + navSet.higher(30));

        System.out.println("Poll First: " + navSet.pollFirst());
        System.out.println("Poll Last: " + navSet.pollLast());

        System.out.println("Descending Set: " + navSet.descendingSet());

        // ================= QUEUE =================
        System.out.println("\n===== QUEUE INTERFACE =====");

        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);
        System.out.println("Element: " + queue.element());
        System.out.println("Peek: " + queue.peek());

        System.out.println("Remove: " + queue.remove());
        System.out.println("Poll: " + queue.poll());

        System.out.println("Queue after removal: " + queue);

        // ================= DEQUE =================
        System.out.println("\n===== DEQUE INTERFACE =====");

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("B");
        deque.addLast("C");
        deque.offerFirst("A");
        deque.offerLast("D");

        System.out.println("Deque: " + deque);
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        System.out.println("Remove First: " + deque.removeFirst());
        System.out.println("Remove Last: " + deque.removeLast());

        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());

        // ================= MAP =================
        System.out.println("\n===== MAP INTERFACE =====");

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Rahul");
        map.put(102, "Priya");
        map.put(103, "Arjun");

        System.out.println("Map: " + map);
        System.out.println("Value for 102: " + map.get(102));
        System.out.println("Contains key 101: " + map.containsKey(101));
        System.out.println("Contains value Rahul: "
                + map.containsValue("Rahul"));

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());
        System.out.println("Size: " + map.size());
        System.out.println("Is Empty: " + map.isEmpty());

        map.remove(103);
        System.out.println("After remove: " + map);

        map.clear();
        System.out.println("After clear: " + map);

        // ================= SORTED MAP =================
        System.out.println("\n===== SORTED MAP INTERFACE =====");

        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.put(30, "C");
        sortedMap.put(10, "A");
        sortedMap.put(20, "B");
        sortedMap.put(40, "D");

        System.out.println("Sorted Map: " + sortedMap);
        System.out.println("First Key: " + sortedMap.firstKey());
        System.out.println("Last Key: " + sortedMap.lastKey());
        System.out.println("Head Map: " + sortedMap.headMap(30));
        System.out.println("Tail Map: " + sortedMap.tailMap(20));
        System.out.println("Sub Map: " + sortedMap.subMap(20, 40));
        System.out.println("Comparator: " + sortedMap.comparator());

        // ================= NAVIGABLE MAP =================
        System.out.println("\n===== NAVIGABLE MAP INTERFACE =====");

        NavigableMap<Integer, String> navMap = new TreeMap<>();

        navMap.put(10, "A");
        navMap.put(20, "B");
        navMap.put(30, "C");
        navMap.put(40, "D");

        System.out.println("Map: " + navMap);
        System.out.println("Lower Key: " + navMap.lowerKey(30));
        System.out.println("Floor Key: " + navMap.floorKey(30));
        System.out.println("Ceiling Key: " + navMap.ceilingKey(25));
        System.out.println("Higher Key: " + navMap.higherKey(30));

        System.out.println("First Entry: " + navMap.firstEntry());
        System.out.println("Last Entry: " + navMap.lastEntry());

        System.out.println("Poll First Entry: " + navMap.pollFirstEntry());
        System.out.println("Poll Last Entry: " + navMap.pollLastEntry());

        System.out.println("Descending Map: " + navMap.descendingMap());

        // ================= ITERATOR =================
        System.out.println("\n===== ITERATOR INTERFACE =====");

        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C");

        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        iterator = languages.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals("Python")) {
                iterator.remove();
            }
        }

        System.out.println("After Iterator remove: " + languages);

        iterator = languages.iterator();

        System.out.println("Remaining elements:");
        iterator.forEachRemaining(System.out::println);

        // ================= LIST ITERATOR =================
        System.out.println("\n===== LIST ITERATOR INTERFACE =====");

        List<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("CN");

        ListIterator<String> listIterator =
                subjects.listIterator();

        System.out.println("Forward Traversal:");

        while (listIterator.hasNext()) {
            System.out.println(
                    listIterator.nextIndex() + " : "
                    + listIterator.next());
        }

        System.out.println("Backward Traversal:");

        while (listIterator.hasPrevious()) {
            System.out.println(
                    listIterator.previousIndex() + " : "
                    + listIterator.previous());
        }

        listIterator = subjects.listIterator();

        listIterator.next();
        listIterator.set("Advanced Java");
        listIterator.add("Python");

        System.out.println("After add and set: " + subjects);

        System.out.println("\n===== PROGRAM COMPLETED =====");

        sc.close();
    }
}
