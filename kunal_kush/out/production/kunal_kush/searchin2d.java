import java.util.Scanner;
import java.util.Arrays;

public class searchin2d {
    public static void main(String[] args){
        int[][] a={
                {14,1,5,8,},
                {14,78,58},
                {1,2,3,4,5}
        };
       int[] m=search(a,78);
        System.out.println(Arrays.toString(m));
    }
    static int[] search(int[][] a,int target){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
