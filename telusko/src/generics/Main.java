package generics;

import Threading.A;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student<Integer>st1=new Student<>(10);
        st1.display();
        Student<String>st2=new Student<>("sahil");
        st2.getObj();
//        Human human = new Human();
//        Employee emp =new Employee();
//        human=emp;
//        ArrayList<Human>humanList=new ArrayList<>();
//        ArrayList<Employee>employeeList=new ArrayList<>();
//        humanList=employeeList; // it will give error because both are different types
//        Human human = new Human();
//        Employee emp =new Employee();
//        human=emp;
//        ArrayList<?>humanList=new ArrayList<>(); // Here the question mark is wildcard
//        ArrayList<Employee>employeeList=new ArrayList<>();
//        humanList=employeeList; // It will not give error because here we use wildcard operator
//        ArrayList<String>string=new ArrayList<>();
//        humanList=string;
        // here we can also assign to string because we are not extending any parent class or class we are using
        // wildcard operator

        // here we will extend out wildcard operator with a class it is upperBound
//        Human human = new Human();
//        Employee emp =new Employee();
//        human=emp;
//        ArrayList<? extends Human>humanList=new ArrayList<>(); // Here the question mark is wildcard
//        ArrayList<Employee>employeeList=new ArrayList<>();
//        humanList=employeeList;
//        humanList=humanList;
//         both of these either in human class or in present in child class
//        ArrayList<String>string=new ArrayList<>();
//        humanList=string;
        // but we cannot use other genrics  rather than which is either present in parent class or either in child class
        // so it will give error

        // here we will extend out wildcard operator with a class it is loweBound
        // because it will only access the methods present in parent class
        Human human = new Human();
        Employee emp =new Employee();
        human=emp;
        ArrayList<? super Human>humanList=new ArrayList<>(); // Here the question mark is wildcard
        ArrayList<Employee>employeeList=new ArrayList<>();
//        humanList=employeeList; // it will giver error because we are using super keyword in super we can only access
        // methods which are present in parent class and employee is child class
        humanList=humanList;
//         both of these either in human class or in present in child class
//        ArrayList<String>string=new ArrayList<>();
//        humanList=string;
        // but we cannot use other genrics  rather than parent class
        // so it will give error
    }
//    public static void a(List<?extends Human>op){ // here we are extending human class that means we can only access method
//        // either in human class or child class of that class
//        for(Human human:op){
//            human.example();
//        }
//    }
//    public static void a(List<?super Human>op) { // here we are calling super keyword for human class that means we can only access method
//        // eihter in human class or parent of human class
//        for (Human human : op) {
//            human.example();
//        }
//    }
}
