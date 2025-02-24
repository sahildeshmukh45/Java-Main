package Generics;

public class Student<T> {
    T obj;

    Student(T obj){
        this.obj=obj;
    }

    Student(){

    }

    public void display(){
        System.out.println("Class Name is" + this.obj.getClass().getName());
    }


}
