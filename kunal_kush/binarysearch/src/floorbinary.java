public class floorbinary {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,7,8,9,10,11,12,13,14,15,16};
        int b=floor(a,6);
        System.out.println(b);
    }

    static int floor(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target<nums[mid]) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return end;
    }
}