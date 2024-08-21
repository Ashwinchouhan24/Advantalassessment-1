
package advantal;
import java.util.*;
public class Advantal3 {
     public static void main(String[] args) {
        // Create a HashMap to store employee IDs and names
        HashMap<Integer, String> hashMapEmployees = new HashMap<>();
        
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> treeMapEmployees = new TreeMap<>();

        // Adding employee entries to HashMap and TreeMap
        hashMapEmployees.put(102, "Alice");
        hashMapEmployees.put(101, "Bob");
        hashMapEmployees.put(103, "Charlie");
        hashMapEmployees.put(104, "David");

        treeMapEmployees.put(102, "Alice");
        treeMapEmployees.put(101, "Bob");
        treeMapEmployees.put(103, "Charlie");
        treeMapEmployees.put(104, "David");

        // Displaying entries in HashMap
        System.out.println("HashMap Entries (Unordered):");
        for (Map.Entry<Integer, String> entry : hashMapEmployees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        System.out.println();

        // Displaying entries in TreeMap
        System.out.println("TreeMap Entries (Ordered by ID):");
        for (Map.Entry<Integer, String> entry : treeMapEmployees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}





   

