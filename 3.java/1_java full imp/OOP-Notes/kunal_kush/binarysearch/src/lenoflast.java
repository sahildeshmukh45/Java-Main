import java.util.Arrays;

public class lenoflast {
    public static void main(String[] args) {
        int []arr={1,2,3,4,4,4,4,5,6,7,89};
        searchRange(arr,4);
        System.out.println(Arrays.toString(searchRange(arr,4)));
    }
    static int[] searchRange(int[] nums,int target){
        int ans[]={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int []nums,int target,boolean findstartindex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}