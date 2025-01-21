package staticexample;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Human sahil=new Human(21,"sahil",10000,false);
        Human a=new Human(21,"a",10000,false);
        Human b=new Human(21,"b",15000,true);
        Human c=new Human(21,"c",20000,false);
        Human d=new Human(21,"d",25000,false);
        // we can also call  this without making object because it is static variable
        System.out.println(Human.population);
        Main oop=new Main();
        oop.fun();
        oop.fun2();
        oop.greeting();
        a.checking();
    }
    void fun2(){
        greeting();
        // in this function both are non static so it can run but at the end we have to make an object for fun2 method
    }
    static void fun(){
       // greeting();
        // it will give error because inside static we cant run any method or function which is non-static we have to
        // we have to make object first then we can run like
        Main op =new Main();
        op.greeting();
    }
    void greeting(){
        System.out.println("Hello");
    }
}
