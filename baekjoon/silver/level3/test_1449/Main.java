package silver.level3.test_1449;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        int sum = 1;
        for (int start = 0; start < N; start++) {
            for (int i = start; i < N; i++) {
                if (arr[i] - arr[start] + 1 > L) {
                    sum++;
                    start = i - 1;
                    break;
                }
            }
        }
        System.out.print(sum);
    }
}
