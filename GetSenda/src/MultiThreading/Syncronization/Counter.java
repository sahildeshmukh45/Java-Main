package MultiThreading.Syncronization;

public class Counter{
    private int counter =0;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
