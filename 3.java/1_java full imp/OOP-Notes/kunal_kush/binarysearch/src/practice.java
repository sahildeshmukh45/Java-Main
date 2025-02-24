import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String [] args){
        int[]a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        System.out.println(infinitearray(a,25));

    }
    static int infinitearray(int []a ,int target){
        int start=0;
        int end=1;
        while(target>a[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        int ans=simplebs(a,target, start, end);
        return ans;
    }

    static int simplebs(int[] a,int target,int start,int end){
        while(start<=end){
            int mid=end+(end-start)/2;
            if(a[mid]==target){
                return mid;
            }if(target<a[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
