import java.util.Scanner;
import java.util.ArrayList;


public class leetcodeq {
    public static void main(String[] args){
        int []o={18,345,1764,98,2,7896};
        int ans=oe(o);
        System.out.println(ans);

    }
    static int oe(int[] nums){
        ArrayList<String>n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String a=String.valueOf(nums[i]);
            int len=a.length();
            if(len%2==0){
                n.add(a);
            }
        }
        int sizeo=n.size();
        return sizeo;
    }
}
