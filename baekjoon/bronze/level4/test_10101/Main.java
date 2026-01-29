package baekjoon.bronze.level4.test_10101;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (Arrays.stream(arr).sum() != 180) {
          bw.write("Error");
        } else if (arr[0] == arr[1] && arr[1] == arr[2] && arr[0] == 60) {
            bw.write("Equilateral");
        } else if (Arrays.stream(arr).sum() == 180 && (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2])) {
            bw.write("Isosceles");
        } else {
            bw.write("Scalene");
        }

        bw.close();
    }
}
