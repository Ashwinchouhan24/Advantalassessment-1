package advantal;
import java.util.PriorityQueue;

public class Advantal5 {
    public static void main (String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(7);
        pq.add(4);
        pq.add(1);
        System.out.println("PriorityQueue Elements"+ pq);
        
        System.out.println("PriorityQueue Elements after pooling are:");
        while(!pq.isEmpty())
        {
            System.out.println(pq.poll()+" ");
        }
        
    }
}
