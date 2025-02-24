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
        //by default abstract methods are public
//        Any class that contains one or more abstract methods must also be declared abstract.
//        If a class contains an abstract method it needs to be abstract and vice versa is not true.
//                If a non-abstract class extends an abstract class, then the class must implement all the abstract methods of the abstract class else the concrete class has to be declared as abstract as well.
//        The following are various illegal combinations of other modifiers for methods with respect to abstract modifiers:
                    //final
                    //abstract native
                    //abstract synchronized
                    //abstract static
                    //abstract private
                    //abstract strictfp
        Parent.hello();
        //also we cannot use final keyword in abstract method
//        not every variable (or field) that you declare is static

    }
}