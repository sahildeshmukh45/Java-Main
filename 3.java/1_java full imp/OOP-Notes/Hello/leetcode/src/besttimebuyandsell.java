import java.util.Arrays;

public class besttimebuyandsell {
    public static void main(String[] args) {
        int a[] = {7,6,5,4,2,1};
        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (max < prices[j] - prices[i]) {
                    max = prices[j] - prices[i];
                }
            }
        }
        if(max<=0){
            return 0;
        }
        return max;
    }

}