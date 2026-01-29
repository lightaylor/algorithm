package baekjoon.silver.level5.test_1427;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        int[] score = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            score[i] = Integer.parseInt(String.valueOf(arr[i]));
        }

        Arrays.sort(score);

        for (int i = arr.length; i > 0;  i--) {
            bw.write(String.valueOf(score[i - 1]));
        }
        bw.close();
    }
}
