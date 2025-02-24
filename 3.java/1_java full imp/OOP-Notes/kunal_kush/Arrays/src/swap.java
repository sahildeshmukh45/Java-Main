import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] m={1,2,3,4,5,6,7,8,9};
        swap(m,1,4);
        System.out.println(Arrays.toString(m));
    }
    static void swap(int[] a,int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }
}
