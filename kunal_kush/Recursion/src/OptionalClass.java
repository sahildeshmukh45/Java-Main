import java.util.*;
public class OptionalClass {
    public static void main(String[] args) {
        List<String> aa = Arrays.asList("sahil", "saurabh", "rushi", "pratik", "hruturaj", "prasad", "harshal");
        Optional<String> ans = aa.stream()
                .filter(a -> a.contains("h"))
                .findFirst();
        System.out.println(ans);
    }
}
