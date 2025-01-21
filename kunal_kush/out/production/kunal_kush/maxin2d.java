import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class maxin2d {
    public static void main(String[] args){
        int[][] a={
                {14,1,5,8,},
                {78,7,58},
                {1,2,3,4,5}
        };
        int m=max(a);
        System.out.println(m);
    }
    static int max(int[][] a){
         int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(max<a[i][j]){
                    max=a[i][j];
                }
            }
        }
        return max;
    }
}
