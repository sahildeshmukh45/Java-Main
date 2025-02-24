package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        list.forEach(num -> System.out.println(num%2==0));
        // we use stream when we don't have to make changes on original list we use stream it will copy all the value
        // we can use stream only once  stream provides lot's of methods like filter,map etc but we have to create new stream
        // as we can use stream only once
//        Stream<Integer> s1=list.stream();
//        Stream<Integer> s2=s1.filter(n->n%2==0);
//        Stream<Integer> s3=s2.map(n->n*2);
//        s3.forEach(n-> System.out.println(n));

//        int result=s3.reduce(0,(a,b)->a+b);
//        System.out.println(result);
//        in simple term we can write like as given below
//        int result =list.stream()
//                .map(n-> n*2)
//                .filter(n->n%2==0)
//                .reduce (0,(a,b)->a+b);
//        System.out.println(result);
//        Stream<Integer>sortedValues =list.stream()
//                .map(n-> n*2)
//                .sorted();
//        sortedValues.forEach(n-> System.out.println(n));


    }
}
