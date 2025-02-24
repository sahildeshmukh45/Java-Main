package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class   SetA {
    public static void main(String[] args) {
   Set <Integer>a=new HashSet<>();
   //set only contains unique value set is un-order and also un-index
        //tree set give sorted value
        Set <Integer>aa=new TreeSet<>();
        aa.add(15);
        aa.add(22);
        aa.add(3);
        aa.add(47);
        aa.add(11);
        aa.add(19);
        aa.add(110);
        //iterator is used for iterate over the values
        Iterator<Integer> Values=aa.iterator();
        //now nums will contain some inbuilt method that we can use as has next is use for to check does it contain next value
        //also next() is use for check the next value
        while(Values.hasNext()){
            System.out.println(Values.next());
        }

    }
}
