package baekjoon.bronze.level2.test_27487;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = (int) Arrays.stream(arr).filter(x -> x == 2).count();
            int answer = 0;
            int idx = 0;

            if (sum == 0){
                answer = 1;
            } else if (sum % 2 == 0) {
                for (int j = 0; j < m - 1; j++) {
                    idx += arr[j] == 2 ? 1 : 0;
                    if (idx == (sum / 2)) {
                        answer = j + 1;
                        break;
                    }
                }
            } else {
                answer = -1;
            }
            bw.write(String.valueOf(answer));
            bw.newLine();
        }
        bw.close();
    }
}
