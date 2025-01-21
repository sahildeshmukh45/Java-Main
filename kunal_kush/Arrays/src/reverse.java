import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class reverse {
    public static void main(String[] args){
        int[] m={11,1,5,2,63,58,98,75,2};
//        swap(m,2,5);
        reverse(m);
       System.out.println(Arrays.toString(m));
    }
    static void swap(int[] a,int first,int second){
        for(int i=0;i<a.length;i++){
            int temp=a[first];
            a[first]=a[second];
            a[second]=temp;
        }
    }
    static void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while (start<end){
        swap(a,start,end);
        start++;
        end--;
        }
    }
}
