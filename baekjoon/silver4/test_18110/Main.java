package silver4.test_18110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int sum = 0;
        int round = (int) Math.round(n * 0.15);
        for (int i = round; i < n - round; i++) {
            sum += arr[i];
        }

        if (round > 0) {
            sum = Math.round((float) sum / (n - (2 * round)));
        }
        System.out.print(sum);
    }
}
