package interfaces.extendemo2;
public interface A {
    void fun();
    // always remember if we declare static method in interface we have to declare the body
    //  and static method always call by the class name
    static void greet(){

    }
}
