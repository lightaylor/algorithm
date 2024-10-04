package silver.level3.test_10974;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        do {
            for (int i = 0; i < n; i++) {
                bw.write(String.valueOf(arr[i]));
                if (i < n - 1) {
                    bw.write(" ");
                }
            }
            bw.newLine();
        } while (nextPermutation(arr, n));
        bw.close();
    }

    private static boolean nextPermutation(int[] arr, int n) {
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

        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }
}
