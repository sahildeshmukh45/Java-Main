import java.util.ArrayList;
import java.util.List;

class LearnArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(55); // fo adding the value
        list.add(25);
        list.add(35);
        list.add(85);
        list.add(39);
        list.add(1,23); // for adding in particular index
        list.remove(1); // here 1 is index of list
        list.remove(Integer.valueOf(35)); // here we are sending value
        list.get(0); // 0 is index
        list.set(2,1000); // for updating existing index with value
        list.contains(23);
        list.forEach(x-> System.out.println(x));

//        list.addAll(); for adding another arrayList directly
//        time complexity is big of n becasue inside they are using for loop

    }
}