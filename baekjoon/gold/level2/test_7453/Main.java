package baekjoon.gold.level2.test_7453;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        long[][] arr = new long[4][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0][i] = Long.parseLong(st.nextToken());
            arr[1][i] = Long.parseLong(st.nextToken());
            arr[2][i] = Long.parseLong(st.nextToken());
            arr[3][i] = Long.parseLong(st.nextToken());
        }

        int index = 0;
        long[] abSums = new long[n * n];
        long[] cdSums = new long[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                abSums[index] = arr[0][i] + arr[1][j];
                cdSums[index++] = arr[2][i] + arr[3][j];
            }
        }

        Arrays.sort(abSums);
        Arrays.sort(cdSums);

        long answer = 0;
        int left = 0, right = cdSums.length - 1;
        while (left < cdSums.length && right >= 0) {
            long sum = abSums[left] + cdSums[right];

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                int abCount = 0;
                int cdCount = 0;

                long currentAB = abSums[left];
                long currentCD = cdSums[right];

                while (left < cdSums.length && abSums[left] == currentAB) {
                    left++;
                    abCount++;
                }
                while (right >= 0 && cdSums[right] == currentCD) {
                    right--;
                    cdCount++;
                }
                answer += (long) abCount * cdCount;
            }
        }

        System.out.print(answer);
    }
}
