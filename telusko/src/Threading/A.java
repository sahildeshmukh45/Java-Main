package Threading;

public class A extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
