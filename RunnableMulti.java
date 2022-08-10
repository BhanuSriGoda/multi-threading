import java.util.*;
class RunnableMulti{
    
    public static void main(String[] args) {
        RunnableMulti demo=new RunnableMulti();

       
        ThreadA obj = new ThreadA();
        Thread t1=new Thread(obj);
        ThreadB obj2= new ThreadB();
        ThreadC obj3= new ThreadC();
        ThreadD obj4= new ThreadD();
        ThreadE obj5= new ThreadE();
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
        Thread t4=new Thread(obj4);
        Thread t5=new Thread(obj5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        


    }
}
class ThreadA implements Runnable{
    public void run()
        {
            System.out.println("Hello india");
        }

}
class ThreadB implements Runnable{
    public void run()
        {
            System.out.println("Hello india");
        }

}
class ThreadC implements Runnable{
    public void run()
        {
            System.out.println("Hello india");
        }

}
class ThreadD implements Runnable{
    public void run()
        {
            System.out.println("Hello india");
        }

}
class ThreadE implements Runnable{
    public void run()
        {
            System.out.println("Hello india");
        }

}