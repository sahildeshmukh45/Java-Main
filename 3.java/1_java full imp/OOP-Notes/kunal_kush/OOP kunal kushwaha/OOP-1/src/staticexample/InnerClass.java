package staticexample;

import java.util.Arrays;
// outside class cannot be static
public class InnerClass {
    public static void main(String[] args) {
        Test op=new Test("sahil");
        Test op1=new Test("op1");
        op.age=45;
        op1.age=46;
        System.out.println(op.age);
        System.out.println(op1.age);
        System.out.println(op.name);
        System.out.println(op1.name);
        System.out.println(Human.population);

    }
     static class Test {
        int age;
//        static int age;
        String name;
//        static String name;
        public Test(String name) {
            this.name = name;
//            Test.name=name;
        }
        public Test(int age){
            this.age=age;
        }
    }
}

// In this we saw that if we create a class inside a class then create an object in main method
// we create class as static because we have to access in main method which is also static
//if we did not create inner class as static than we need to make an object of main class
// then only we can call inner class
// outer class cannot be static
// if we made class as static then we have to create an object of that class to access the methods or constructor of class
// if we made any primitive or object as static then the main static will update according to our code for example in above
// code if we make String name as static String name the every time we create an object and and give String name then latest name
// will update to all of the above name because String name is static see the commented part for reference