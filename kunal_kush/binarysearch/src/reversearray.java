import java.util.Arrays;
import java.util.Scanner;
public class reversearray {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        int i=1;
        int x=input.nextInt();
        while(i<=10){
            System.out.println(x*i);
            i++;
        }
    }
//    static void swap(int []a,int first,int second){
//        int temp=a[first];
//        a[first]=a[second];
//        a[second]=temp;
//    }
//    static void reverse(int []a){
//        int start=0;
//        int end=a.length-1;
//        while(start<end){
//            swap(a,start,end);
//            start++;
//            end--;
//        }
//    }
}
