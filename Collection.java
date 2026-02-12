import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // ===== LIST =====
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");   // Duplicate allowed
        System.out.println("List: " + list);

        // ===== SET =====
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");   // Duplicate ignored
        System.out.println("Set: " + set);

        // ===== QUEUE =====
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue);
        System.out.println("Removed from Queue: " + queue.poll());

        // ===== MAP =====
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Neha");
        map.put(2, "CDAC");
        map.put(1, "Java");   // Key duplicate → value replaced
        System.out.println("Map: " + map);
    }
}
