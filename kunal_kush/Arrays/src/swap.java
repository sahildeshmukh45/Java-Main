import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class swap {
    public static void main(String[] args) {
        isPrimeNo(2,15);
    }
    static void isPrimeNo(int input1,int input2){
            for(int i=input1;i<=input2;i++) {
                boolean isPrime = true;
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }
            }
    }
}
