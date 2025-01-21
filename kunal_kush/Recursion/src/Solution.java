//  leetCode 1342

import java.util.IllegalFormatCodePointException;

// if the number is odd then increase the steps by 1  and subtract 1 from the num
// if the number is even then increase the steps by 1 and divide the num by 2
class Solution {
    static int sum=0;
    static void reverse(int num){
        if(num==0){
            return;
        }
        int rem=num%10;
        sum=sum*10+rem;
        reverse(num/10);
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(41));
        reverse(1234);
        System.out.println(sum);
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    private static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}