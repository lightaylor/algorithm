package silver.level1.test_6064;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int m = input[0];
            int n = input[1];
            int x = input[2] - 1;
            int y = input[3] - 1;

            int answer = 0;
            boolean check = false;
            for (int j = x; j < n * m; j += m) {
                if (j % n == y) {
                    answer = j + 1;
                    check = true;
                    break;
                }
            }
            bw.write(String.valueOf(check ? answer : -1));
            bw.newLine();
        }
        bw.close();
    }
}
