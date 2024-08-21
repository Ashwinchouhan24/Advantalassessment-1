package advantal;
import java.util.*;

public class Advantal4 {
    public final static int count = 1000;
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("******ArrayList******");
        testPerformance(l1);

        LinkedList<Integer> l2 = new LinkedList<>();
        System.out.println("******LinkedList******");
        testPerformance(l2);



    }
    private static void testPerformance(List<Integer> l1) {

        long start_time = System.nanoTime();
        for(int i = 0; i<count; i++)
            l1.add(i);
        long end_time = System.nanoTime();
        System.out.println("Time to insert elements from end : " + (end_time-start_time) + " ns");

        start_time = System.nanoTime();
        for(int i = 0; i<count; i++)
            l1.remove(0);
        end_time = System.nanoTime();
        System.out.println("Time to remove elements from start : " + (end_time-start_time) + " ns");

        start_time = System.nanoTime();
        for(int i = 0; i<count; i++)
            l1.add(0, i);
        end_time = System.nanoTime();
        System.out.println("Time to insert elements from start : " + (end_time-start_time) + " ns");

        start_time = System.nanoTime();
        for(int i = 0; i<count; i++)
            l1.remove(l1.size() - 1);
        end_time = System.nanoTime();
        System.out.println("Time to remove elements from end : " + (end_time-start_time) + " ns");
    }
}
