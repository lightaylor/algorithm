package baekjoon.silver.level3.test_13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] distances = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] prices = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long totalCost = 0;
        long minPrice = prices[0];

        for (int i = 0; i < n - 1; i++) {
            totalCost += minPrice * distances[i];
            if (prices[i + 1] < minPrice) {
                minPrice = prices[i + 1];
            }
        }
        System.out.print(totalCost);
    }
}
