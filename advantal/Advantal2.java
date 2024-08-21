package advantal;

import java.util.HashSet;

public class Advantal2 {
    public static void main (String args[])
    {
         HashSet<String> ss = new HashSet<>();

        
        ss.add("Apple");
        ss.add("Banana");
        ss.add("Cherry");
        ss.add("Guava");
        ss.add("pinneapple");
        System.out.println(ss);
        ss.add("Apple");
        System.out.println(ss);
        
    }
}
