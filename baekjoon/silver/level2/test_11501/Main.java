package silver.level2.test_11501;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] prices = new int[N];
            int max = 0;

            for (int j = 0; j < N; j++) {
                prices[j] = sc.nextInt();
                max = Math.max(max, prices[j]);
            }

            long maxProfit = getMaxProfit(prices);
            System.out.println(maxProfit);
        }
    }

    public static long getMaxProfit(int[] prices) {
        int n = prices.length;
        long maxProfit = 0;
        int maxPriceSoFar = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (prices[i] > maxPriceSoFar) {
                maxPriceSoFar = prices[i];
            }
            maxProfit += Math.max(0, maxPriceSoFar - prices[i]);
        }

        return maxProfit;
    }
}
