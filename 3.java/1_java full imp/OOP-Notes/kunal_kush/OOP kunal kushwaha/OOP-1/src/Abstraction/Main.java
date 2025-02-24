package Abstraction;

public class Main {
    public static void main(String[] args) {

        Parent a = new son();
        a.career();
        a.partner();
        Parent d = new daughter();
        d.career();
        //you cannot create object of abstract class it  will give error because we know they did not have body
        // also in abstract class we cannot create body it will also give error that's why we also cannot create abstract constructor
        // abstract static method cannot be overridden so we also cannot create abstract static method in abstract class
        // Parent mom=new Parent();
        //but you can create static methods in abstract class that is aloud because we call static method via class name
        //also we can create normal methods in abstract class
        Parent.hello();
        //also we cannot use final keyword in abstract class
        System.out.println(a.num);



    }
}