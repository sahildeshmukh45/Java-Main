package StreamApi;

import Threading.A;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.forEach(num -> System.out.println(num%2==0));
    }
}
