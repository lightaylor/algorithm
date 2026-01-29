package baekjoon.silver.level4.test_11047;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int targetValue = Integer.parseInt(input[1]);
        int[] valueArr = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            valueArr[i] = value;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (targetValue - valueArr[i] >= 0) {
                answer += targetValue / valueArr[i];
                targetValue %= valueArr[i];
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
