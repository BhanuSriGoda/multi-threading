import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerThread implements Runnable {
  
    private String command;
    
    public WorkerThread(String s){
        command=s;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
        System.out.println(i); 
        }
    }
}
class SimpleThreadPool{

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Runnable worker = new WorkerThread("");
        executor.execute(worker);
        executor.shutdown();
        
    }
}