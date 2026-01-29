package baekjoon.silver.level2.test_2477;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] directions = new int[6];
        int[] lengths = new int[6];
        int[] maxValue = new int[2];
        int[] maxIndex = new int[2];

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            directions[i] = Integer.parseInt(st.nextToken());
            lengths[i] = Integer.parseInt(st.nextToken());

            if (directions[i] < 3 && maxValue[0] < lengths[i]) {
                maxValue[0] = lengths[i];
                maxIndex[0] = i;
            } else if (directions[i] > 2 && maxValue[1] < lengths[i]){
                maxValue[1] = lengths[i];
                maxIndex[1] = i;
            }
        }

        int minValue = Math.abs(lengths[(maxIndex[0] + 5) % 6] - lengths[(maxIndex[0] + 1) % 6])
                        * Math.abs(lengths[(maxIndex[1] + 5) % 6] - lengths[(maxIndex[1] + 1) % 6]);
        int answer = (maxValue[0] * maxValue[1] - minValue) * N;

        System.out.print(answer);
    }
}
