package Set;

import java.util.HashSet;
import java.util.Set;

public class SetCustom {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();

        set.add(12);
        set.add(11);
        set.add(45);
        set.add(36);

        // set contains unique value
        // it contains random order,
        // every element contain hash value hash value is unique for every element and if we try to
        // add that element again then it will not add because that element is already there so theres
        // hasValue is also there

        set.contains(12);

        set.remove(11);

    }
}
