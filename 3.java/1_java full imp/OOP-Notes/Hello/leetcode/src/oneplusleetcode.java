import java.util.Arrays;

public class oneplusleetcode {
        public static void main(String[] args){
            int s[]={9,9};
            System.out.println(Arrays.toString(plusOne(s)));
        }
        static int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }

            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
}
