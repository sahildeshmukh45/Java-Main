import java.util.*;

public class Sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        SelectionSort(arr,arr.length-1 ,0,0);
        System.out.println(Arrays.toString(arr));
    }

   static void bubbleSort(int[] arr, int row, int column){
        if(row==0){
            return;
        }
        if(column<row){
            if(arr[column]>arr[column+1]){
                int temp= arr[column];
                arr[column]=arr[column+1];
                arr[column+1]=temp;
            }
            bubbleSort(arr,row,column+1);
        }
        bubbleSort(arr,row-1,0);
   }
   static void SelectionSort(int[] arr,int row ,int column,int max){
        if(row==0){
            return;
        }
        if(column<row){
            if(arr[column]>arr[max]) {
                SelectionSort(arr, row, column + 1, column); // if the column is max th
            }
            else{
                SelectionSort(arr,row,column+1,max); //
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            SelectionSort(arr,row-1,0,0);
        }
   }

}
