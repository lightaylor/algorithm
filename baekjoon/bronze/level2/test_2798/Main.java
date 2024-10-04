package bronze.level2.test_2798;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] card = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(card);
        int temp = 0;

        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum > m) {
                        break;
                    } else if (Math.abs(m - sum) < Math.abs(m - temp)) {
                        temp = sum;
                    }
                }
            }
        }

        bw.write(String.valueOf(temp));
        bw.close();
    }
}
