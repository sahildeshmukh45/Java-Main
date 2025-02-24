package StreamApi;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class OptionalClass {
    public static void main(String[] args) {
        List<String>names=Arrays.asList("sahil","aabb","xyz","opo","kok");
        String ans=names.stream()
                .filter(str -> str.contains("k"))
                .findFirst()
                .orElse("Not found");
        System.out.println(ans);

        //Method reference
        List<String>namesM=Arrays.asList("sahil","aabb","xyz","opo","kok");
        List<String>Mans=namesM.stream() // here we are using List instead of Stream because we are converting our stream to List
//                .map(str->str.toUpperCase())
                .map(String::toUpperCase) // here we are calling method String and converting to uppercase that's why it is method reference
                .toList();
        System.out.println(Mans);
    }
}
