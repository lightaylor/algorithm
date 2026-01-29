package baekjoon.silver.level4.test_1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] B = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < n; i++) {
            answer += A[i] * B[n - 1 - i];
        }

        System.out.print(answer);
    }

}
