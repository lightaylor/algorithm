package baekjoon.silver.level4.test_1620;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int m = arr[1];
        String[] pockemon = new String[n];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            pockemon[i] = br.readLine();
            map.put(pockemon[i], i + 1);
        }

        for (int i = 0; i < m; i++) {
            String question = br.readLine();
            String answer = "";
            if (question.matches("[0-9]+")) {
                answer = pockemon[Integer.parseInt(question) - 1];
            } else {
                answer = String.valueOf(map.get(question));
            }
            bw.write(answer);
            bw.newLine();
        }
        bw.close();
    }
}
