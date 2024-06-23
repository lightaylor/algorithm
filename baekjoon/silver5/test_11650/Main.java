package silver5.test_11650;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, List> map = new HashMap<>();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]));
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]));
        for (int i = 0; i < n; i++) {
            bw.write(arr[i][0] + " " + arr[i][1]);
            bw.newLine();
        }

        bw.close();
    }
}
