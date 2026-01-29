package baekjoon.silver.level3.test_1213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] alphabets = br.readLine().toCharArray();

        Arrays.sort(alphabets);
        Map<Character, Integer> map = new TreeMap<>();

        for (char alphabet : alphabets) {
            map.put(alphabet, map.getOrDefault(alphabet, 0) + 1);
        }

        int oddCount = 0;
        char oddAlphabet = 0;
        for (char c : map.keySet()) {
            int count = map.get(c);
            if (count % 2 != 0) {
                oddCount += 1;
                oddAlphabet = c;
            }
        }

        if (oddCount > 1) {
            System.out.print("I'm Sorry Hansoo");
            return;
        }

        StringBuilder answer = new StringBuilder();
        for (char c : map.keySet()) {
            int count = map.get(c) / 2;
            answer.append(Character.toString(c).repeat(count));
        }

        StringBuilder sb = new StringBuilder(answer);
        if (oddCount > 0) {
            answer.append(oddAlphabet);
        }

        answer.append(sb.reverse());

        System.out.print(answer);
    }
}
