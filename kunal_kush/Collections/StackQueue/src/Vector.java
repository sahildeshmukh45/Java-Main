import java.util.List;

public class Vector<I extends Number> {
    // vector is like list it implements  the list interface
    //  multiple threads can access  arraylist,
    // but only one thread can access vector class
    // that means arrayList is faster
    public static void main(String[] args) {
        List<Integer> vector= (List<Integer>) new Vector<Integer>();
        vector.add(45);
        vector.add(46);
        vector.add(47);
        vector.add(49);
        vector.add(50);


    }
}
