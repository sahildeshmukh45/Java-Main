import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
       int a= fib(5);
        System.out.println(a);
    }
    static int fib(int n){
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return b;
    }
}