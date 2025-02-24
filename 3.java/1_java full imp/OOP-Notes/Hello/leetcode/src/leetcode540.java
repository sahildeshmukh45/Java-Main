public class leetcode540 {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,4,4,5,5,6,6,7,7,8};
        System.out.println(singleNonDuplicate(a));
    }
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 != 0 && nums[mid] == nums[mid - 1]) ){
                //in the above if the position of mid is odd it will check previous element if even then check next element
                start = mid + 1;}
            else
            {end = mid;}
        }
        return nums[start];
    }
}

