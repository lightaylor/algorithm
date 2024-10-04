package silver.level2.test_18870;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sortArr = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(sortArr);

        int idx = 0;
        for (int i : sortArr) {
            map.put(i, idx++);
        }

        for (int i : arr) {
            bw.write(map.get(i) + " ");
        }
        bw.close();
    }
}
