package Access_Encapsulation;

import java.util.ArrayList;

public class main {
//    ENCAPSULATION
//    encapsulation and abstraction focuses on security
//    inheritance and polymorphism focuses on code reusability
//
//    Encapsulation means wrapping up the implementation  of data members and methods in class
//    Encapsulation means hiding data using public, private, protected keywords
//    you can hide data using getter and setter that is meant by encapsulation
//    Encapsulation means internal working and abstraction means external showing and gaining information
//    Data hiding is achieved by encapsulation
// getter get the calue , setter set the value

    //if we declare variable or method as private then we can only call that in that class but by creating getter and setter
    //method we can access and modify it anywhere
    // if you want to access anything outside the package no matter it is variable or object you have to declare public
    //if we cannot write any protected or private or public it is default and default is use in same package
    //if we declare variable or method as protected then we can oly access in subclass which are extended from that class
    //we can also access in another package but in only subclass that are extended from the that parent class in which the protected is declare
    //public means we can access it anywhere
    //no modifier can only access in the same package
     public static void main(String[] args){
         ArrayList<Integer> a=new ArrayList<Integer>();
         a.add(1);
         a.add(4);
         a.add(5);
         for(int i=0;i<a.size();i++){
             System.out.println(a.get(i));
         }
     }
}
