package bronze.level1.test_1546;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double sum = 0;

        Arrays.sort(input);

        for(double i : input) {
            sum += i / input[n - 1] * 100;
        }

        bw.write(String.valueOf(sum / n));
        bw.close();
    }
}
