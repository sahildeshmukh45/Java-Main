import java.util.ArrayList;


public class ReturnArrayList {
    public static void main(String[] args) {
        int [] arr={1,2,4,3,4,5,4,6,4,7,4,8,4,9};
////        System.out.println((findAllIndex(arr,4,0, new ArrayList<Integer>())));
        System.out.println(returnListWithoutArgumentList(arr,4, 0));
//        repeat(10);
    }
    static ArrayList<Integer>findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
    static ArrayList<Integer> returnListWithoutArgumentList(int [] arr, int target, int index){
        ArrayList<Integer> list =new ArrayList<Integer>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromAboveCalls=returnListWithoutArgumentList(arr,target,index+1);
        list.addAll(ansFromAboveCalls);
        return list;
    }
    static void repeat(int x){
        if(x==0){
            return;
        }
        repeat(x-1);
        System.out.println(x);
    }
}


