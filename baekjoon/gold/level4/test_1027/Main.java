package gold.level4.test_1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] buildings = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int viewCount = getViewCount(buildings, N, i);
            answer = Math.max(answer, viewCount);
        }
        System.out.print(answer);
    }

    private static int getViewCount(int[] buildings, int N, int idx) {
        int viewCount = 0;
        double slope;

        double temp = 1000000000;
        for (int i = idx - 1; i >= 0; i--) {
            slope = (double) (buildings[i] - buildings[idx]) / (i - idx);
            if (temp > slope) {
                temp = slope;
                viewCount++;
            }
        }

        temp = -1000000000;
        for (int i = idx + 1; i < N; i++) {
            slope = (double) (buildings[i] - buildings[idx]) / (i - idx);
            if (temp < slope) {
                temp = slope;
                viewCount++;
            }
        }
        return viewCount;
    }
}
