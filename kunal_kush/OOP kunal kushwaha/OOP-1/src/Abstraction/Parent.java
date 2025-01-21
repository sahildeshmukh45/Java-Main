package Abstraction;

abstract public class Parent {
    // if class contain one or more than one abstract method or function we have to declare class as abstract
    //if extends this class to any subclass then we have to declare all the method in that subclass if we didn't declare it will give error
    int age;
    //you cannot create object of abstract class it  will give error because we know they did not have body
    // also in abstract class we cannot create body it will also give error that's why we cannot create abstract constructor also
    // abstract static method cannot be overridden so we also cannot create abstract static method
    abstract void career ();
    abstract void partner();
    //but you can create static methods in abstract class that is aloud because we call static method by class name
    //also we have to declare the body of static method
    static void hello(){
        System.out.println("hey");
    }
    //also we can create normal methods in abstract class
    void normal(){
        System.out.println("This is normal methods");
    }
    //also we cannot use final class in abstract class we know we cannot reassign value of final variable and can access only in that class
    //in which final variable is declared
    final int num=45;

}
