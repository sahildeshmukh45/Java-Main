package PolyMorphism;

public class Circle extends Shapes {
    int a=1;
    void area(){
        System.out.println("Area  of circle is = pie*r*r");
    }
    public Circle(){
        System.out.println("circle constructor");
    }
    public Circle(int a){
        this.a=a;
        System.out.println(a);
    }
}
