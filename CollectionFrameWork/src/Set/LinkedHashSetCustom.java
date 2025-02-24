package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCustom {

    public static void main(String[] args) {
        Set<Integer> set =new LinkedHashSet<>();

        set.add(12);
        set.add(11);
        set.add(45);
        set.add(36);
        // here order will same for elements
        set.contains(12);

        set.remove(11);

    }
}
