package Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    //    public Human(Human other){
//        this.age=other.age;
//        this.name=other.name;
//    }
//    public Object clone() throws CloneNotSupportedException{
//        //this is shallow copy
//        return super.clone();
//    }
    public Object clone() throws CloneNotSupportedException {
        Human a = (Human) super.clone(); // this is deep copy
        a.arr = new int[a.arr.length];
        for (int i = 0; i < a.arr.length; i++) {
            a.arr[i] = this.arr[i];
        }
        return a;
    }
}
