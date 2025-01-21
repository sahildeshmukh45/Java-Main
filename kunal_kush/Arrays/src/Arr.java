
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Arr {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int[] a=new int[x];
        for(int i=0;i<a.length;i++){

            a[i]=input.nextInt();
        }
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        System.out.println(Arrays.toString(a));
    }
}
