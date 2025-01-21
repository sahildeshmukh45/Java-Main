package staticexample;

import com.sun.jdi.PathSearchingVirtualMachine;
import org.w3c.dom.ls.LSOutput;


public class StaticBlock {
    static int a=5;
    static int b;
    // static block only runs once when first object is created
    static {
        System.out.println("i am staticblock");
        a=4;
        b = a*4;
    }
    public static void main(String[] args) {
        StaticBlock.b=48;
        StaticBlock.a=45;
        StaticBlock op=new StaticBlock();
        System.out.println(StaticBlock.a +"  "+ StaticBlock.b);
        StaticBlock.b+=3;
        System.out.println(StaticBlock.a +"  "+ StaticBlock.b);
        StaticBlock op2=new StaticBlock();
        StaticBlock.b+=5;
        // static block only runs once when first object is created because it obusly it is belong to class not an object
        System.out.println(StaticBlock.a +"  "+ StaticBlock.b);
    }
}
