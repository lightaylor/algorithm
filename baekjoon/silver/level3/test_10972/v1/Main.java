package baekjoon.silver.level3.test_10972.v1;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (nextPermutation(arr, n)) {
            for (int i = 0; i < n; i++) {
                bw.write(String.valueOf(arr[i]));
                if (i < n - 1) {
                    bw.write(" ");
                }
            }
        } else {
            bw.write("-1");
        }
        bw.newLine();
        bw.close();
    }

    static boolean nextPermutation(int[] arr, int n) {
        int i = n - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i -= 1;
        }

        if (i <= 0) {
            return false;
        }

        int j = n - 1;
        while (arr[i - 1] >= arr[j]) {
            j -= 1;
        }

        int temp = arr[j];
        arr[j] = arr[i - 1];
        arr[i - 1] = temp;
        j = n - 1;

        while (i < j) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }
}
