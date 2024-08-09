package silver2.test_10819;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int answer = 0;

        do {
            answer = Math.max(calculation(n), answer);
        } while (nextPermutation(n));

        bw.write(String.valueOf(answer));
        bw.close();
    }

    private static int calculation(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += Math.abs(arr[i-1] - arr[i]);
        }
        return sum;
    }

    private static boolean nextPermutation(int n) {
        int i = n - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i -= 1;
        }

        if (i < 1) {
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
