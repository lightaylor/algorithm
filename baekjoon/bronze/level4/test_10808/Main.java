package baekjoon.bronze.level4.test_10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        int[] alphabetCount = new int[26];
        for (int i = 0; i < input.length; i++) {
            alphabetCount[input[i] - 'a'] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabetCount.length; i++) {
            sb.append(alphabetCount[i]).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}
