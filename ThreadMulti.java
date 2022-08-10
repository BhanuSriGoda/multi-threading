import java.util.*;
class ThreadMulti{
    
    public static void main(String[] args) {
        
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3=new thread3();
        thread4 t4=new thread4();
        thread5 t5=new thread5();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        

    }
}class thread1 extends Thread
{
    public void run()
    {
        System.out.println("Hello All");
    }
}
class thread2 extends Thread
{
    public void run()
    {
        System.out.println("Hello All");
    }
}
class thread3 extends Thread
{
    public void run()
    {
        System.out.println("Hello All");
    }
}
class thread4 extends Thread
{
    public void run()
    {
        System.out.println("Hello All");
    }
}
class thread5 extends Thread
{
    public void run()
    {
        System.out.println("Hello All");
    }
}