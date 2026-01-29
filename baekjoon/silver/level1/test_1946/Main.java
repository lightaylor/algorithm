package baekjoon.silver.level1.test_1946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        List<int[][]> candidateList = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] candidates = new int[N][2];
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                candidates[j][0] = Integer.parseInt(st.nextToken());
                candidates[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(candidates, Comparator.comparingInt(a -> a[0]));

            candidateList.add(candidates);
        }

        StringBuilder answer = new StringBuilder();
        for (int[][] candidates : candidateList) {
            int count = 1;
            int candidate = candidates[0][1];

            for (int i = 1; i < candidates.length; i++) {
                if (candidates[i][1] < candidate) {
                    count++;
                    candidate = candidates[i][1];
                }
            }
            answer.append(count).append(" ");
        }

        System.out.print(answer.toString().trim());
    }
}
