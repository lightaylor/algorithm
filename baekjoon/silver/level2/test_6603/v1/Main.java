package silver.level2.test_6603.v1;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        while (!input.equals("0")) {
            int[] temp = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = temp[0];
            int[] lotto = new int[n];
            arr = new int[n];
            System.arraycopy(temp, 1, lotto, 0, n);

            for (int i = 6; i < n; i++) {
                arr[i] = 1;
            }

            do {
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 0) {
                        bw.write(lotto[i] + " ");
                    }
                }
                bw.newLine();
            } while (nextPermutation(n));
            bw.newLine();
            input = br.readLine();
        }
        bw.close();
    }

    private static boolean nextPermutation(int n) {
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

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;
        j = n - 1;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 1;
            j -= 1;
        }

        return true;
    }
}
