import java.util.Arrays;

public class MergeAbdulBari {
    public static void main(String[] args) {

    }
   static int[] merge(int[] arr, int brr[]){
       int i=0;
       int j=0;
       int k=0;

       int[] c=new int[arr.length+brr.length];
       while(i<arr.length && j<brr.length) {
           if (arr[i] < brr[j]) {
               c[k++] = arr[i++];
           } else {
               c[k++] = brr[j++];
           }
       }
       for(;i<arr.length;i++){
           c[k++]=arr[i];
       }
       for(;j<brr.length;j++){
           c[k++]=brr[j];
       }
       return c;
   }
}
