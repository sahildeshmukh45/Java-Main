package constructor_classes_object;

//oop-1 constructor,classes,object,keywords
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student op=new Student();
//        Student op1=new Student(op);
//        System.out.println(op1.marks);
//        Student s=new Student();
//        s.name="v";
//        System.out.println(s.name);
//        s=new Student();
//        System.out.println(s.name);
//        A obj;
//        for (int i=0;i<1000000000;i++){
//            obj=new A("random");
        //}
        op.add(4,5);
        System.out.println(op.name);
    }
}
class Student {
    String name;
    float marks;
    int roll_no;
    int temp;
    int a;
    int b;
    int c;
    int d;

    void changename(String name){
        this.name=name;
    }
//         Student(){
//        this.name="sahil";
//        this.marks=45.3f;
//        this.roll_no=98;
//    }
    Student(Student other){
        this.name=other.name;
        this.roll_no=other.roll_no;
        this.marks=other.marks;
    }
    // Upper code is for calling constructor in another constuctor
    Student(){
        this("Sahil",45.3f,48);
    }
    int add(int c,int d){
        return this.c+this.d;
    }

    Student(String name1, float mark1, int roll){
        this.name=name1;
        this.marks=mark1;
        this.roll_no=roll;
    }
}


class A{
    String name;
    public A(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
