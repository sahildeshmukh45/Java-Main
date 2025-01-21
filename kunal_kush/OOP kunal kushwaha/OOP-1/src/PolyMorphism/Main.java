package PolyMorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes shapes=new Shapes();
//        Circle circle=new Circle();
//        Triangle triangle=new Triangle();
//        Shapes square =new Square();
//        square.area();
//        square.checking();
//         previously we know that we can access the element which is present in the reference type(parent class) and cannot
//         access the element of object type also here is same we can only access element which is present in parent class but,
//         if we made an object of child class and parent class also have same method or function or constructor then it will called child
//        class method in simple term it will override the parent class override means
//        child class has method name same as the parent class(super class) parameter ,return type is same but
//         the body is different it is called override
//        remember it only override when the parent class and child class has same name function and parameter otherwise we can
//        only access variable function which is in reference class
//         to avoid override you can declare   method as final you cannot override a method which is final
//         like you cannot create a method to similar which is declare final
//        also we cannot override static method it will always show which is present in the reference class that means parent class like below
//        overriding depend upon object and static doesnt depend upon object
//        Square.greeting();
        Shapes a=new Square();
        a.area();
        a.checking();

    }
}
