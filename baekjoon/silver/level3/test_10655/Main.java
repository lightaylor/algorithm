package silver.level3.test_10655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] checkPoint = new int[N][2];
        long totalSum = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            checkPoint[i][0] = x;
            checkPoint[i][1] = y;

            if (0 < i) {
                totalSum += Math.abs(checkPoint[i - 1][0] - x) + Math.abs(checkPoint[i - 1][1] - y);
            }
        }

        long answer = totalSum;
        for (int i = 1; i < N - 1; i++) {
            long sum = totalSum;
            sum -= Math.abs(checkPoint[i - 1][0] - checkPoint[i][0]) +
                Math.abs(checkPoint[i - 1][1] - checkPoint[i][1]);
            sum -= Math.abs(checkPoint[i + 1][0] - checkPoint[i][0]) +
                Math.abs(checkPoint[i + 1][1] - checkPoint[i][1]);
            sum += Math.abs(checkPoint[i - 1][0] - checkPoint[i + 1][0]) +
                Math.abs(checkPoint[i - 1][1] - checkPoint[i + 1][1]);

            answer = Math.min(answer, sum);
        }

        System.out.print(answer);
    }
}
