import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class leetcode2 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 2, 33}
        };
        int ans = 0;
        ArrayList<Integer> m = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            ans = sum(a[i]);
            m.add(ans);
        }
        int maxx = max(m);
        System.out.println(maxx);
    }

    static int sum(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        return sum;
    }

    static int max(ArrayList<Integer> op) {
        int max = op.get(0);
        for (int i = 1; i < op.size(); i++) {
            if (max < op.get(i)) ;
            max = op.get(i);
        }
        return max;
    }
}
