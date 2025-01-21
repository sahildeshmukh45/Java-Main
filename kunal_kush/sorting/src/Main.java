import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,5,4,6,4,7,4,8,4,9,4};
        System.out.println(retrunWithothListArgument(arr,4,0));
    }
    static int binarySearch(int [] arr, int target, int start , int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return target;
        }
        if(target<arr[mid]){
         return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
    static int linearSearch(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearch(arr,target,index+1);
    }
   static ArrayList<Integer> returnInRange(int[] arr,int target,int index,ArrayList<Integer> List){
        if(index==arr.length){
            return List;
        }
        if(target==arr[index]){
            List.add(index);
        }
        return returnInRange(arr,target,index+1,List);
    }
    static ArrayList<Integer> retrunWithothListArgument(int[] arr, int target, int index){
        ArrayList<Integer> list =new ArrayList<>();
            if(index==arr.length){
                return list;
            }
            if(arr[index]==target){
                list.add(index);
            }
            ArrayList<Integer>ansFromAboveCalls=retrunWithothListArgument(arr,target,index+1);
            list.addAll(ansFromAboveCalls);
            return list;
    }
}