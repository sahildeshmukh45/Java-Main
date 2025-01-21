import java.util.Scanner;
public class ArrayQuestion{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(isSorted(arr,0));
    }
//    check whether array is sorted or not
static boolean isSorted(int [] arr,int index){
        if(arr.length-1==index){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }
}