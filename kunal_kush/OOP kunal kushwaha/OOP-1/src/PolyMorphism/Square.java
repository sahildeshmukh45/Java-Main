package PolyMorphism;

public class Square extends Shapes{
    int c=49;
    int d=22;
    int b=0;
     void area(){
        System.out.println("Area of square = side*side");
    }
    void checking(){
        System.out.println("I am in square");
    }
    static void greeting(){
        System.out.println("greetings from Square");
    }
    public Square(){
        System.out.println("I am in square");
    }
    public Square(int b){
         this.b=b;
        System.out.println(b);
    }
}
