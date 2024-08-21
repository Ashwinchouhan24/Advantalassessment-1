package advantal;
public class D2q1 {
    public static void main (String args[])
    {
        First f= new First();
        Second s=new Second();
        f.start();
        s.start();
    }
}
class First extends Thread{
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            System.out.print(i+" ");  
        }
    }
}
class Second extends Thread{
    public void run()
    {
        for(char ch='A';ch<='E';ch++)
        {
            System.out.print(ch+" ");
        }
    }
}