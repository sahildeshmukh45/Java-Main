import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MInno {
    public static void main(String[]  args) {
        int []x={11,44,2,22,66,77};
        System.out.println(minno(x));
    }
    static int minno(int[] a){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
}










