package advantal;
public class D2q3 {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for(int i = 0; i<10; i++){
            System.out.println("hlw Java Thread t1");
            try{
            Thread.sleep(50);
            }
            catch(Exception e){
                System.out.println("error");
            }
        }
    };
        Runnable obj2 = () -> {
            for(int i = 0; i<10; i++){
            System.out.println("hlw Java Thread t2");
            try{
                Thread.sleep(50);
                }
                catch(Exception e){
                    System.out.println("error");
                }
            }
    };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{
            Thread.sleep(30);
            }
            catch(Exception e){
                System.out.println("error");
            }
        t2.start();

    }
}