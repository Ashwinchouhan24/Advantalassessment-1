package advantal;
public class Advantal6 {
    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Get elements
        System.out.println("Element at index 1: " + list.get(1)); // Output: Banana

        // Set element at index 1
        list.set(1, "Blueberry");
        System.out.println("Element at index 1 after update: " + list.get(1)); // Output: Blueberry

        // Remove element at index 2
        list.remove(2);
        System.out.println("Size after removal: " + list.size()); // Output: 2

        // Iterate through the list
        System.out.println("Elements in the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

