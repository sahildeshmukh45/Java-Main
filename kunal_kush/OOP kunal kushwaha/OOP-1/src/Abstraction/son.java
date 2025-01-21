package Abstraction;

import Access_Encapsulation.A;

public class son extends Parent {
    int a;
    int b;
    void career(){
        System.out.println("I am going to be doctor");
    }
    void partner(){
        System.out.println("I love abc she is 19");
    }
    int add(int a,int b){
        this.a=a;
        this.b=b;
        return this.a+this.b;
    }
}
