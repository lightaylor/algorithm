package bronze.level1.test_2309;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int n = 9;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j) {
                            bw.write(String.valueOf(arr[k]));
                            bw.newLine();
                        }
                    }
                    bw.close();
                    return;
                }
            }
        }
    }
}
