package baekjoon.silver.level3.test_1463;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int[] arr = new int[input + 1];

        for (int i = 2; i <= input; i++) {
            arr[i] = arr[i - 1] + 1;
            if (i % 2 == 0) arr[i] = Math.min(arr[i], arr[i/2] + 1);
            if (i % 3 == 0) arr[i] = Math.min(arr[i], arr[i/3] + 1);
        }

        bw.write(String.valueOf(arr[input]));
        bw.close();
    }
}
