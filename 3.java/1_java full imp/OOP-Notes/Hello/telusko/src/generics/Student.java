package generics;

public class Student<T>{
    T obj;
    public Student(T obj){
        this.obj=obj;
    }
    public void display(){
        System.out.println("class name is"+obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}

