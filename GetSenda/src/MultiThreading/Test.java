package MultiThreading;

public class Test implements Runnable{
    // NEW , RUNNABLE, RUNNING, WAITING/BLOCKED, TERMINATED;


    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Test test = new Test();
        Thread t1 =new Thread(test);   // new t1
        System.out.println(t1.getState());     // NEW
        t1.start();      // RUNNABLE or RUNNING
        System.out.println(t1.getState());
        t1.sleep(2000); // Timed Waiting
        System.out.println(t1.getState());
        t1.join(); // It will wait until t1 finish its task and then go for main method
        System.out.println(t1.getState());
        t1.run();

    }
}
