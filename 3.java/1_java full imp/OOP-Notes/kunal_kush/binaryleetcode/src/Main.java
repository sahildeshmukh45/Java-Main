public class Main {
    public static void main(String[] args) {
        int []nums={4,5,6,7,0,1,2};
        System.out.println(peakelment(nums));
    }
    static int peakelment(int []arr) {
         int start=0;
         int end=arr.length-1;
         while(start<end){
             int mid=start+(end-start)/2;
             if(arr[mid]>arr[mid+1]){
                 end=mid;
             }else{
                 start=mid+1;
             }
         }
         return start;
    }
}