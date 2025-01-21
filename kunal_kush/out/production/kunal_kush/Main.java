import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] m = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean ans = linearsearch(m, 5);
    }

    static boolean linearsearch(int[] a, int target) {
        if (a.length == 0) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                return true;
            }
        }
        return false;
    }
}