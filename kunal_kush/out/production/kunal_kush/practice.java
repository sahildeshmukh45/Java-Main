import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        System.out.println(isPal(121));
    }
    static boolean isPal(int x){
        int reverse=0;
        int n=x;
        int count=0;
        while(x>0){
            int rem=x%10;
            reverse=reverse*10+rem;
            x=x/10;
            count++;
        }
        System.out.println(reverse);
        if(n==reverse){
            return true;
        }
        return false;
    }
}