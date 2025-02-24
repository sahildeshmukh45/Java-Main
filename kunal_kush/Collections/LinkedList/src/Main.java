import javax.management.AttributeList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        the individual box known as node
//        the starting of the box means first box is head and end box is tail
//        every node only knows about there datatype and next node which is connected to previous node

        LL list=new LL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(6);
        list.insert(5,3);
        list.display();
        list.insertRec(33,2);
        list.display();

        List op =new ArrayList<Integer>();

    }

    
}
