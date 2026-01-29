package baekjoon.silver.level2.test_10971.v1;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        int[][] cost = new int[n][n];
        int answer = 1_000_000 * n;

        for (int i = 0; i < n; i++) {
            cost[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[i] = i;
        }

        do {
            if (arr[0] != 0) break;
            boolean ok = true;
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (cost[arr[i - 1]][arr[i]] == 0) {
                    ok = false;
                } else {
                    sum += cost[arr[i - 1]][arr[i]];
                }
            }
            if (ok && cost[arr[n-1]][arr[0]] != 0) {
                sum += cost[arr[n-1]][arr[0]];
                answer = Math.min(answer, sum);
            }
        } while (nextPermutation(n));

        bw.write(String.valueOf(answer));
        bw.close();
    }

    private static boolean nextPermutation(int n) {
        int i = n - 1;
        while (i >= 0 && arr[i-1] >= arr[i]) {
            i -= 1;
        }

        if (i < 0) {
            return false;
        }

        int j = n - 1;
        while (arr[i - 1] >= arr[j]) {
            j -= 1;
        }

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;
        j = n - 1;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j -= 1;
            i += 1;
        }

        return true;
    }
}
