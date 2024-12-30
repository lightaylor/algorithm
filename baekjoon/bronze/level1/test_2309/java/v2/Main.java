package bronze.level1.test_2309.java.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final int TOTAL_COUNT = 9;
    private static final int TARGET_SUM = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[TOTAL_COUNT];
        for (int i = 0; i < TOTAL_COUNT; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int sum = Arrays.stream(arr).sum();
        for (int i = 0; i < TOTAL_COUNT; i++) {
            for (int j = i + 1; j < TOTAL_COUNT; j++) {
                if (sum - arr[i] - arr[j] == TARGET_SUM) {
                    for (int k = 0; k < TOTAL_COUNT; k++) {
                        if (k != i && k != j) {
                            System.out.println(arr[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}
