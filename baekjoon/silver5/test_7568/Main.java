package silver5.test_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] crew = new int[n][2];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            crew[i] = new int[]{a, b};
        }

        for (int i = 0; i < n; i++) {
            int x = crew[i][0];
            int y = crew[i][1];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int p = crew[j][0];
                int q = crew[j][1];

                if (x < p && y < q) {
                    rank[i] += 1;
                }
            }
        }

        for (int i : rank) {
            System.out.print(i + 1 + " ");
        }
    }
}
