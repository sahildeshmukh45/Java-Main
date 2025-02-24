public class Main {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int b=bsearch(a,6);
        System.out.println(b);
    }
    static int bsearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}