public class BinarySearchRecursion {
    public static void main(String args[]){
        int[] arr={1,2,3,4,55,67,78,88,99,101,112,123,134,145,156};
        int target=134;
        System.out.println(search(arr,target,0,arr.length-1));
    }
  static int search(int[] arr,int target, int start , int end){
        if(start>end){
            return -1;
        }
        int mid =start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return search(arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);
    }
}
