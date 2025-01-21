package Singelton;

public class Singleton {
    private Singleton(){

    }
    private static Singleton a;
    public static Singleton getInstance(){
        if(a == null){
            a =new Singleton();
        }
        return a;
    }
}
// here if we want that user can only create only one object then we can declare