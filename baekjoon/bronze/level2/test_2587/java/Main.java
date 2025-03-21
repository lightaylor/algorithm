package bronze.level2.test_2587.java;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        int i = 0;

        for (int n : arr) {
            arr[i++] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        bw.write(Math.round(Arrays.stream(arr).average().getAsDouble()) + "\n" + arr[2]);
        bw.close();
    }
}
