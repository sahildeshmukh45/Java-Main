import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args){
        int[] arr={9,8,7,6,5,4,3,2,1};
        MergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void MergeSort(int[] arr,int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = (start+end)/2;

        MergeSort(arr, start, mid);
        MergeSort(arr, mid, end);

        mergeSortInPlace(arr, start, mid, end);
    }
        private static void mergeSortInPlace(int[] arr, int start, int mid, int end){
        int[] mix=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i< mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                arr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[start+l]=mix[l];
        }
    }
}
