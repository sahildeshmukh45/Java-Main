package Threading;

public class Threading {
    public static void main(String[] args) {
        //it is compulsory to declare run method in thread class
        A a=new A();
        B b=new B();
        // there is start method to start the thread
        //we can set priority by
//        System.out.println(a.getPriority());
//        a.start();
//        b.start();
        //we can set priority by range is 1 to 10,
        //we can also use sleep method to  waiting
        a.setPriority(9);
        Runnable ra=new runabbleA();
        Runnable rb=new runnableB();
       Thread t1=new Thread(ra);
       Thread t2=new Thread(rb);
       //synchronize is use when two methods are running at the same time and we have to run only one method
        //synchronize will help in  to run one method at the one time we declare synchronize method it
        t1.start();
        t2.start();
    }
}
