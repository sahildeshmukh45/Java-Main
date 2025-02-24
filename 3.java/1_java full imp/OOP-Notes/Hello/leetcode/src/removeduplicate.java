import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class removeduplicate {
    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 6};
        Solution op=new Solution();
        System.out.println( op.removeDuplicates(a));
    }
}
    class Solution {
        public int removeDuplicates(int[] nums) {
            HashSet<Integer> arr= new HashSet<Integer>();
            for(int i=0;i<nums.length;i++){
                arr.add(nums[i]);


            }
            int a[]=new int[arr.size()];
            int l=0;
            for(int i:arr){
                a[l]=i;
                l++;
            }
            Arrays.sort(a);
            for(int h=0;h<a.length;h++){
                nums[h]=a[h];
            }



            return arr.size();
        }
    }
