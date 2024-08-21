package advantal;
import java.util.*;

public class Debug1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        
        // Complex operation: Sorting and removing elements
        Collections.sort(list, (a, b) -> a.length() - b.length()); // Custom comparator
        list.removeIf(s -> s.startsWith("D"));

        System.out.println("Sorted and Filtered List: " + list);

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Complex operation: Merging maps and handling conflicts
        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("Three", 3);
        map2.put("Four", 4);
        map.putAll(map2); // Potentially problematic if there are conflicts

        System.out.println("Merged Map: " + map);
        
        // Complex operation: Incorrect use of a method
        List<String> subList = list.subList(0, 4); // Potential issue: IndexOutOfBoundsException
        System.out.println("SubList: " + subList);
    }
}
