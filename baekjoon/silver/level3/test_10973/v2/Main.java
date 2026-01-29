package baekjoon.silver.level3.test_10973.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = 0;
        int end = 0;

        for (int i = N - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                start = i;
                break;
            }
        }

        if (start == 0) {
            System.out.print(-1);
            return;
        }

        for (int i = N - 1; i >= start; i--) {
            if (arr[start - 1] > arr[i]) {
                end = i;
                break;
            }
        }

        int temp = arr[start - 1];
        arr[start - 1] = arr[end];
        arr[end] = temp;

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < start; i++) {
            answer.append(arr[i]).append(" ");
        }

        for (int i = N - 1; i >= start; i--) {
            answer.append(arr[i]).append(" ");
        }

        System.out.print(answer.toString().trim());
    }
}
