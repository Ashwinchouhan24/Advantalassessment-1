
package advantal;
class X{
    volatile int count;

    public void getcount(){
        System.out.println(count);
    } 
}

public class D2q4{
    public static void main(String[] args)  throws Exception {
        X x = new X();
        Runnable b = () -> {
            for(int i = 0; i<1000; i++){
                x.count++;
        }
        };
        Runnable a = () -> {
            for(int i = 0; i<1000; i++){
                x.count++;
            }
        };
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        x.getcount();

    }
}
