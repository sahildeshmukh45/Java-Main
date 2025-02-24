package Threading;

public class runabbleA implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
