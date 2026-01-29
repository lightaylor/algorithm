package baekjoon.gold.level4.test_1339;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] alphabetValue = new int[26];
        for (int i = 0; i < n; i++) {
            char[] word = br.readLine().toCharArray();

            int length = word.length;
            for (int j = 0; j < length; j++) {
                alphabetValue[word[j] - 'A'] += (int) Math.pow(10, length - j - 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i :alphabetValue) {
            if (i > 0) {
                list.add(i);
            }
        }

        list.sort(Collections.reverseOrder());

        int answer = 0;
        int num = 9;
        for (int i : list) {
            answer += i * num--;
        }

        System.out.print(answer);
    }
}
