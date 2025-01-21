import java.util.Arrays;
// in selection sort we find maxIndex and swap  with last index
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMax(arr,0,last);
               swap(arr,maxIndex,last);
        }
    }
    static int getMax(int[] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int max,int last){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}

