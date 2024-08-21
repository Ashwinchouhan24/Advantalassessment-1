
package advantal;
import java.util.ArrayList;
public class Advantal {

    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
       
         al.add(10);
         al.add(20);
         al.add(30);
         al.add(40);
         al.add(50);
          
                  System.out.println(al);
                  al.remove(1);
                  System.out.println("Arraylist after removal");
                 System.out.print(al);
    }   
}
