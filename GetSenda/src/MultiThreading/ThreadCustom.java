package MultiThreading;

import java.util.concurrent.CompletableFuture;

public class ThreadCustom extends Thread{
//    public void run(){
//        for(int i=0;i<5;i++){
//            try{
//                Thread.sleep(5000);
//            }catch (Exception e){
//                throw new RuntimeException(e);
//            }
//        }

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" priority"+ Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadCustom t1 = new ThreadCustom();
//        t1.start();
//        t1.join();
        CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->{
            try{
            Thread.sleep(2000);
            } catch (Exception e){
                System.out.println(e);
            }
            return "ok";
        });
        // THIS THREAD WILL DO THERE TASK INDEPENDENTLY
        // THIS IS BY DEFAULT DEMON THREAD
        // MAIN METHOD WILL NOT WAIT FOR THESE THREAD
        // IF OTHER METHOD WILL GET TERMINATED THESE WILL ALSO GET TERMINATED
        // WE CAN DO SOMETHINGS LIKE .get() TO DO THINGS WORK
    }

}

// start, run, Sleep, Join, setPriority, interrupt, yield, setDaemon
// Interrupt will interrupt whatever the thread was doing like if thread is sleeping it will interrupt sleep
// or if thread is running it will interrupt running
//thread.yield() it will give hint to other thread to execute
//Daemon thread is background thread if set daemon = true it will not wait for executing
// if other method get completed it will get terminated compitable