public class Main {
    public static void main(String[] args) {
//        1> identify that you can break down problem into  smaller problem
//        2>write the recursive relation if needed
//        3>draw the recursion tree
//        4>about the tree:-

        System.out.println(fib(6));
    }

    static void print(int x) {
        if (x == 5) { // this is base condition for breaking the recursion
            System.out.println(5);
            return;
        }
        System.out.println(x);
        //this is tail recursion because below step is last function call
        print(x + 1);
    }

    static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        int fact;
        fact = x * factorial(x - 1);
        return fact;
    }

    static int fib(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        return fib(x - 1) + fib(x - 2);
    }
}
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {2, 7, 11, 15, 2};
//        int target = 9;
//        twoSum2(arr, target);
//    }
//
//    static void twoSum2(int[] arr, int target) {
//        ArrayList<int[]> resultList = new ArrayList<>();
//        HashMap<Integer, Integer> numMap = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            int complement = target - arr[i];
//            if (numMap.containsKey(complement)) {
//                resultList.add(new int[]{numMap.get(complement), i});
//            }
//            numMap.put(arr[i], i);
//        }
//
//        // Print the ArrayList
//        for (int[] pair : resultList) {
//            System.out.println(Arrays.toString(pair));
//        }
//    }
//}
