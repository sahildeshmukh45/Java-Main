package PolyMorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(4,5);
        obj.sum(4,5,6);
        // this are the compile time or static polymorphism it is also called method overloading
        //in which it will decide at the compile time which method to call
    }
}
