import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int [] arr={2,4,9,11,14,3};
        int target=13;
        System.out.println(Arrays.toString(twoSum(arr,target)));
        reverse(arr);
        twoSum2(arr,target);

        String a = "My name is Om";
        String[] words = a.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        String result = reversedString.toString().trim();
        System.out.println(result);
    }
    static int[] twoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{-1,-1};
    }
    static void reverse(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    static void twoSum2(int[] arr, int target){
        ArrayList a=new ArrayList();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    a.add(new int[]{i,j});
                }
            }
        }
    }


}
