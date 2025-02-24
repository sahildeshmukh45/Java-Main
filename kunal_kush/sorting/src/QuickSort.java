import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {53, 40, 55, 2, 111};
        quickSort(arr, 0, arr.length - 1);
//        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int [] arr, int start, int end){
        if(start>= end){
                return;
            }
            int low= start;
            int high= end;
            int mid = start+(end-start)/2;
            int pivot= arr[mid];

            while(start<=end){
                while(arr[start]<pivot){
                    start++;
                }
                while(arr[end]>pivot){
                    end--;
                }
                if(start<=end){
                    int temp= arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                     end--;
                }
            }
            quickSort(arr,start,high);
            quickSort(arr,low,end);
    }
}