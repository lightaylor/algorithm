package baekjoon.bronze.level3.test_9366;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int[] arr = stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);

            if (arr[0] + arr[1] <= arr[2]) {
                System.out.println("Case #" + i + ": invalid!");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Case #" + i + ": equilateral");
            } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) {
                System.out.println("Case #" + i + ": isosceles");
            } else {
                System.out.println("Case #" + i + ": scalene");
            }
        }
    }
}
