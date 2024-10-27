package silver.level2.test_3085_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] candies = new char[N][N];

        for (int i = 0; i < N; i++) {
            candies[i] = br.readLine().toCharArray();
        }

        int maxSum = 1;
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (x + 1 < N) {
                    swap(candies, x, y, x + 1, y);
                    maxSum = Math.max(rowSum(candies, x), Math.max(maxSum, rowSum(candies, x + 1)));
                    maxSum = Math.max(maxSum, ColumSum(candies, y));
                    swap(candies, x, y, x + 1, y);
                }

                if (y + 1 < N) {
                    swap(candies, x, y, x, y + 1);
                    maxSum = Math.max(ColumSum(candies, y), Math.max(maxSum, ColumSum(candies, y + 1)));
                    maxSum = Math.max(maxSum, rowSum(candies, x));
                    swap(candies, x, y, x, y + 1);
                }

                if (maxSum == N) {
                    break;
                }
            }
        }
        System.out.print(maxSum);
    }

    private static void swap(char[][] candies, int x1, int y1, int x2, int y2) {
        char target = candies[x1][y1];
        candies[x1][y1] = candies[x2][y2];
        candies[x2][y2] = target;
    }

    private static int ColumSum(char[][] candies, int y) {
        int maxCount = 1;
        int count = 1;
        char candy = candies[0][y];

        for (int i = 1; i < candies.length; i++) {
            if (candy == candies[i][y]) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                candy = candies[i][y];
                count = 1;
            }
        }

        return maxCount;
    }

    private static int rowSum(char[][] candies, int x) {
        int maxCount = 1;
        int count = 1;
        char candy = candies[x][0];

        for (int i = 1; i < candies.length; i++) {
            if (candy == candies[x][i]) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                candy = candies[x][i];
                count = 1;
            }
        }

        return maxCount;
    }
}
