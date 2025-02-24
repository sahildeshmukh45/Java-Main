package abstractanonmyousclass;



abstract class A{
    abstract void show();
    abstract void config();
}

class B extends A {
    void show() {
        System.out.println("in B Config");
    }

    void config() {
        System.out.println("In B Config");
    }
}

public class Main {
    public static void main(String[] args) {
        // no matter what this method always override all the above method because we are declaring here in front of object

        A obj = new B(){
            @Override
            void show () {
            System.out.println("In Show");
        }

            @Override
            void config () {
            System.out.println("In config");
        }
        } ;
        obj.show();
        obj.config();
    }
}
