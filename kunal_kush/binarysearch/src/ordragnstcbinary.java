public class ordragnstcbinary {
    public static void main(String[] args){
        int [] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int b=orderbs(a,6);
        System.out.println(b);
    }
    static int orderbs(int [] nums, int target ){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target== nums[mid]){
                return mid;
            }else if(isasce(nums)){
                if(target< nums[mid]){
                    end=mid-1;
                }else if(target> nums[mid]){
                    start=mid+1;
                }
            }else{
                if(target< nums[mid]){
                    start=mid+1;
                }else if(target> nums[mid]){
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    static boolean isasce(int num[]){
        int start=0;
        int end=num.length-1;
        if(num[start]<num[end]){
            return true;
        }
        return false;
    }
}










