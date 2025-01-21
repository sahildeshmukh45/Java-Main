import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {

    }

    static boolean LinearSearch(int [] arr,int target,int index){
        if(arr[index]==target){
            return true;
        }
        return LinearSearch(arr,target,index+1);
    }
    static int searchIndex(int [] arr,int target,int index){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchIndex(arr,target,index+1);
    }
    static void findAllIndex(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==index){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
    static void fib(int x){
        if(x==0){
            System.out.println(0);
        }
        if(x==1){
            System.out.println(1);
        }
        int count=2;
        int a=0;
        int b=1;
        while(count<=x){
            int temp=b;
            b=b+a;

        }
    }
    static int binarySearch(int[] arr,int target,int start ,int end){
        if(start>end){
            return -1;
        }
        int mid =start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
            return binarySearch(arr,target, mid+1,end);
        }
        return binarySearch(arr,target,start,mid-1);
    }
}
